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
import com.ruoyi.system.domain.MianequEquipment;
import com.ruoyi.system.service.IMianequEquipmentService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 主机列Controller
 * 
 * @author ruoyi
 * @date 2020-10-13
 */
@Controller
@RequestMapping("/system/mianequipment")
public class MianequEquipmentController extends BaseController
{
    private String prefix = "system/mianequipment";

    @Autowired
    private IMianequEquipmentService mianequEquipmentService;

    @RequiresPermissions("system:mianequipment:view")
    @GetMapping()
    public String mianequipment()
    {
        return prefix + "/mianequipment";
    }

    /**
     * 查询主机列列表
     */
    @RequiresPermissions("system:mianequipment:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(MianequEquipment mianequEquipment)
    {
        startPage();
        List<MianequEquipment> list = mianequEquipmentService.selectMianequEquipmentList(mianequEquipment);
        return getDataTable(list);
    }

    /**
     * 导出主机列列表
     */
    @RequiresPermissions("system:mianequipment:export")
    @Log(title = "主机列", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(MianequEquipment mianequEquipment)
    {
        List<MianequEquipment> list = mianequEquipmentService.selectMianequEquipmentList(mianequEquipment);
        ExcelUtil<MianequEquipment> util = new ExcelUtil<MianequEquipment>(MianequEquipment.class);
        return util.exportExcel(list, "mianequipment");
    }

    /**
     * 新增主机列
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存主机列
     */
    @RequiresPermissions("system:mianequipment:add")
    @Log(title = "主机列", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(MianequEquipment mianequEquipment)
    {
        return toAjax(mianequEquipmentService.insertMianequEquipment(mianequEquipment));
    }

    /**
     * 修改主机列
     */
    @GetMapping("/edit/{mianequId}")
    public String edit(@PathVariable("mianequId") Long mianequId, ModelMap mmap)
    {
        MianequEquipment mianequEquipment = mianequEquipmentService.selectMianequEquipmentById(mianequId);
        mmap.put("mianequEquipment", mianequEquipment);
        return prefix + "/edit";
    }

    /**
     * 修改保存主机列
     */
    @RequiresPermissions("system:mianequipment:edit")
    @Log(title = "主机列", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(MianequEquipment mianequEquipment)
    {
        return toAjax(mianequEquipmentService.updateMianequEquipment(mianequEquipment));
    }

    /**
     * 删除主机列
     */
    @RequiresPermissions("system:mianequipment:remove")
    @Log(title = "主机列", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(mianequEquipmentService.deleteMianequEquipmentByIds(ids));
    }
}
