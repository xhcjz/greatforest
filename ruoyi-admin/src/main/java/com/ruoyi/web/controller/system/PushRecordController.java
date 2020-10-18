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
import com.ruoyi.system.domain.PushRecord;
import com.ruoyi.system.service.IPushRecordService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 推送记录管理Controller
 * 
 * @author ruoyi
 * @date 2020-10-14
 */
@Controller
@RequestMapping("/system/record")
public class PushRecordController extends BaseController
{
    private String prefix = "system/record";

    @Autowired
    private IPushRecordService pushRecordService;

    @RequiresPermissions("system:record:view")
    @GetMapping()
    public String record()
    {
        return prefix + "/record";
    }

    /**
     * 查询推送记录管理列表
     */
    @RequiresPermissions("system:record:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(PushRecord pushRecord)
    {
        startPage();
        List<PushRecord> list = pushRecordService.selectPushRecordList(pushRecord);
        return getDataTable(list);
    }

    /**
     * 导出推送记录管理列表
     */
    @RequiresPermissions("system:record:export")
    @Log(title = "推送记录管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(PushRecord pushRecord)
    {
        List<PushRecord> list = pushRecordService.selectPushRecordList(pushRecord);
        ExcelUtil<PushRecord> util = new ExcelUtil<PushRecord>(PushRecord.class);
        return util.exportExcel(list, "record");
    }

    /**
     * 新增推送记录管理
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存推送记录管理
     */
    @RequiresPermissions("system:record:add")
    @Log(title = "推送记录管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(PushRecord pushRecord)
    {
        return toAjax(pushRecordService.insertPushRecord(pushRecord));
    }

    /**
     * 修改推送记录管理
     */
    @GetMapping("/edit/{recordId}")
    public String edit(@PathVariable("recordId") Long recordId, ModelMap mmap)
    {
        PushRecord pushRecord = pushRecordService.selectPushRecordById(recordId);
        mmap.put("pushRecord", pushRecord);
        return prefix + "/edit";
    }

    /**
     * 修改保存推送记录管理
     */
    @RequiresPermissions("system:record:edit")
    @Log(title = "推送记录管理", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(PushRecord pushRecord)
    {
        return toAjax(pushRecordService.updatePushRecord(pushRecord));
    }

    /**
     * 删除推送记录管理
     */
    @RequiresPermissions("system:record:remove")
    @Log(title = "推送记录管理", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(pushRecordService.deletePushRecordByIds(ids));
    }
}
