package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.PushMobile;

/**
 * 推送手机号管理Service接口
 * 
 * @author ruoyi
 * @date 2020-10-14
 */
public interface IPushMobileService 
{
    /**
     * 查询推送手机号管理
     * 
     * @param mobileId 推送手机号管理ID
     * @return 推送手机号管理
     */
    public PushMobile selectPushMobileById(Long mobileId);

    /**
     * 查询推送手机号管理列表
     * 
     * @param pushMobile 推送手机号管理
     * @return 推送手机号管理集合
     */
    public List<PushMobile> selectPushMobileList(PushMobile pushMobile);

    /**
     * 新增推送手机号管理
     * 
     * @param pushMobile 推送手机号管理
     * @return 结果
     */
    public int insertPushMobile(PushMobile pushMobile);

    /**
     * 修改推送手机号管理
     * 
     * @param pushMobile 推送手机号管理
     * @return 结果
     */
    public int updatePushMobile(PushMobile pushMobile);

    /**
     * 批量删除推送手机号管理
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deletePushMobileByIds(String ids);

    /**
     * 删除推送手机号管理信息
     * 
     * @param mobileId 推送手机号管理ID
     * @return 结果
     */
    public int deletePushMobileById(Long mobileId);
}
