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
import com.ruoyi.system.domain.PushMobile;
import com.ruoyi.system.service.IPushMobileService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 推送手机号管理Controller
 * 
 * @author ruoyi
 * @date 2020-10-14
 */
@Controller
@RequestMapping("/system/mobile")
public class PushMobileController extends BaseController
{
    private String prefix = "system/mobile";

    @Autowired
    private IPushMobileService pushMobileService;

    @RequiresPermissions("system:mobile:view")
    @GetMapping()
    public String mobile()
    {
        return prefix + "/mobile";
    }

    /**
     * 查询推送手机号管理列表
     */
    @RequiresPermissions("system:mobile:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(PushMobile pushMobile)
    {
        startPage();
        List<PushMobile> list = pushMobileService.selectPushMobileList(pushMobile);
        return getDataTable(list);
    }

    /**
     * 导出推送手机号管理列表
     */
    @RequiresPermissions("system:mobile:export")
    @Log(title = "推送手机号管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(PushMobile pushMobile)
    {
        List<PushMobile> list = pushMobileService.selectPushMobileList(pushMobile);
        ExcelUtil<PushMobile> util = new ExcelUtil<PushMobile>(PushMobile.class);
        return util.exportExcel(list, "mobile");
    }

    /**
     * 新增推送手机号管理
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存推送手机号管理
     */
    @RequiresPermissions("system:mobile:add")
    @Log(title = "推送手机号管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(PushMobile pushMobile)
    {
        return toAjax(pushMobileService.insertPushMobile(pushMobile));
    }

    /**
     * 修改推送手机号管理
     */
    @GetMapping("/edit/{mobileId}")
    public String edit(@PathVariable("mobileId") Long mobileId, ModelMap mmap)
    {
        PushMobile pushMobile = pushMobileService.selectPushMobileById(mobileId);
        mmap.put("pushMobile", pushMobile);
        return prefix + "/edit";
    }

    /**
     * 修改保存推送手机号管理
     */
    @RequiresPermissions("system:mobile:edit")
    @Log(title = "推送手机号管理", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(PushMobile pushMobile)
    {
        return toAjax(pushMobileService.updatePushMobile(pushMobile));
    }

    /**
     * 删除推送手机号管理
     */
    @RequiresPermissions("system:mobile:remove")
    @Log(title = "推送手机号管理", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(pushMobileService.deletePushMobileByIds(ids));
    }
}
