package com.ruoyi.system.controller;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.EquEquipment;
import com.ruoyi.system.service.IEquEquipmentService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 传感器列Controller
 * 
 * @author ruoyi
 * @date 2020-09-27
 */
@Controller
@RequestMapping("/system/equipment")
public class EquEquipmentController extends BaseController
{
    private String prefix = "system/equipment";

    @Autowired
    private IEquEquipmentService equEquipmentService;

    @RequiresPermissions("system:equipment:view")
    @GetMapping()
    public String equipment()
    {
        return prefix + "/equipment";
    }

    /**
     * 查询传感器列列表
     */

    @RequiresPermissions("system:equipment:list")
    @PostMapping    ("/list")
    @ResponseBody
    @CrossOrigin
    public TableDataInfo list(EquEquipment equEquipment)
    {
        startPage();
        List<EquEquipment> list = equEquipmentService.selectEquEquipmentList(equEquipment);
        return getDataTable(list);
    }

    /**
     * 导出传感器列列表
     */
//    @RequiresPermissions("system:equipment:export")
    @Log(title = "传感器列", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(EquEquipment equEquipment)
    {
        List<EquEquipment> list = equEquipmentService.selectEquEquipmentList(equEquipment);
        ExcelUtil<EquEquipment> util = new ExcelUtil<EquEquipment>(EquEquipment.class);
        return util.exportExcel(list, "equipment");
    }

    /**
     * 新增传感器列
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存传感器列
     */
    @RequiresPermissions("system:equipment:add")
    @Log(title = "传感器列", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(EquEquipment equEquipment)
    {
        return toAjax(equEquipmentService.insertEquEquipment(equEquipment));
    }

    /**
     * 修改传感器列
     */
    @GetMapping("/edit/{equId}")
    public String edit(@PathVariable("equId") Long equId, ModelMap mmap)
    {
        EquEquipment equEquipment = equEquipmentService.selectEquEquipmentById(equId);
        mmap.put("equEquipment", equEquipment);
        return prefix + "/edit";
    }

    /**
     * 修改保存传感器列
     */
//    @RequiresPermissions("system:equipment:edit")
    @Log(title = "传感器列", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(EquEquipment equEquipment)
    {
        return toAjax(equEquipmentService.updateEquEquipment(equEquipment));
    }

    /**
     * 删除传感器列
     */
//    @RequiresPermissions("system:equipment:remove")
    @Log(title = "传感器列", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(equEquipmentService.deleteEquEquipmentByIds(ids));
    }
}
