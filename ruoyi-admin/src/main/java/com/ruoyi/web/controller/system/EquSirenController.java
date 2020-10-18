package com.ruoyi.web.controller.system;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.EquSiren;
import com.ruoyi.system.service.IEquSirenService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 设备报警记录管理Controller
 * 
 * @author ruoyi
 * @date 2020-10-14
 */
@Controller
@RequestMapping("/system/siren")
public class EquSirenController extends BaseController
{
    private String prefix = "system/siren";

    @Autowired
    private IEquSirenService equSirenService;

    @RequiresPermissions("system:siren:view")
    @GetMapping()
    public String siren()
    {
        return prefix + "/siren";
    }

    /**
     * 查询设备报警记录管理列表
     */
    @RequiresPermissions("system:siren:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(EquSiren equSiren)
    {
        startPage();
        List<EquSiren> list = equSirenService.selectEquSirenList(equSiren);
        return getDataTable(list);
    }

    /**
     * 导出设备报警记录管理列表
     */
    @RequiresPermissions("system:siren:export")
    @Log(title = "设备报警记录管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(EquSiren equSiren)
    {
        List<EquSiren> list = equSirenService.selectEquSirenList(equSiren);
        ExcelUtil<EquSiren> util = new ExcelUtil<EquSiren>(EquSiren.class);
        return util.exportExcel(list, "siren");
    }

    /**
     * 新增设备报警记录管理
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存设备报警记录管理
     */
    @RequiresPermissions("system:siren:add")
    @Log(title = "设备报警记录管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(EquSiren equSiren)
    {
        return toAjax(equSirenService.insertEquSiren(equSiren));
    }

    /**
     * 修改设备报警记录管理
     */
    @GetMapping("/edit/{sirenId}")
    public String edit(@PathVariable("sirenId") Long sirenId, ModelMap mmap)
    {
        EquSiren equSiren = equSirenService.selectEquSirenById(sirenId);
        mmap.put("equSiren", equSiren);
        return prefix + "/edit";
    }

    /**
     * 修改保存设备报警记录管理
     */
    @RequiresPermissions("system:siren:edit")
    @Log(title = "设备报警记录管理", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(EquSiren equSiren)
    {
        return toAjax(equSirenService.updateEquSiren(equSiren));
    }

    /**
     * 删除设备报警记录管理
     */
    @RequiresPermissions("system:siren:remove")
    @Log(title = "设备报警记录管理", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(equSirenService.deleteEquSirenByIds(ids));
    }
}
