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
import com.ruoyi.system.domain.EquArea;
import com.ruoyi.system.service.IEquAreaService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 设备区域Controller
 * 
 * @author ruoyi
 * @date 2020-10-14
 */
@Controller
@RequestMapping("/system/area")
public class EquAreaController extends BaseController
{
    private String prefix = "system/area";

    @Autowired
    private IEquAreaService equAreaService;

    @RequiresPermissions("system:area:view")
    @GetMapping()
    public String area()
    {
        return prefix + "/area";
    }

    /**
     * 查询设备区域列表
     */
    @RequiresPermissions("system:area:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(EquArea equArea)
    {
        startPage();
        List<EquArea> list = equAreaService.selectEquAreaList(equArea);
        return getDataTable(list);
    }

    /**
     * 导出设备区域列表
     */
    @RequiresPermissions("system:area:export")
    @Log(title = "设备区域", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(EquArea equArea)
    {
        List<EquArea> list = equAreaService.selectEquAreaList(equArea);
        ExcelUtil<EquArea> util = new ExcelUtil<EquArea>(EquArea.class);
        return util.exportExcel(list, "area");
    }

    /**
     * 新增设备区域
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存设备区域
     */
    @RequiresPermissions("system:area:add")
    @Log(title = "设备区域", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(EquArea equArea)
    {
        return toAjax(equAreaService.insertEquArea(equArea));
    }

    /**
     * 修改设备区域
     */
    @GetMapping("/edit/{areaId}")
    public String edit(@PathVariable("areaId") Long areaId, ModelMap mmap)
    {
        EquArea equArea = equAreaService.selectEquAreaById(areaId);
        mmap.put("equArea", equArea);
        return prefix + "/edit";
    }

    /**
     * 修改保存设备区域
     */
    @RequiresPermissions("system:area:edit")
    @Log(title = "设备区域", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(EquArea equArea)
    {
        return toAjax(equAreaService.updateEquArea(equArea));
    }

    /**
     * 删除设备区域
     */
    @RequiresPermissions("system:area:remove")
    @Log(title = "设备区域", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(equAreaService.deleteEquAreaByIds(ids));
    }
}
