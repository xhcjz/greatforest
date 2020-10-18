package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.PushMobileMapper;
import com.ruoyi.system.domain.PushMobile;
import com.ruoyi.system.service.IPushMobileService;
import com.ruoyi.common.core.text.Convert;

/**
 * 推送手机号管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-10-14
 */
@Service
public class PushMobileServiceImpl implements IPushMobileService 
{
    @Autowired
    private PushMobileMapper pushMobileMapper;

    /**
     * 查询推送手机号管理
     * 
     * @param mobileId 推送手机号管理ID
     * @return 推送手机号管理
     */
    @Override
    public PushMobile selectPushMobileById(Long mobileId)
    {
        return pushMobileMapper.selectPushMobileById(mobileId);
    }

    /**
     * 查询推送手机号管理列表
     * 
     * @param pushMobile 推送手机号管理
     * @return 推送手机号管理
     */
    @Override
    public List<PushMobile> selectPushMobileList(PushMobile pushMobile)
    {
        return pushMobileMapper.selectPushMobileList(pushMobile);
    }

    /**
     * 新增推送手机号管理
     * 
     * @param pushMobile 推送手机号管理
     * @return 结果
     */
    @Override
    public int insertPushMobile(PushMobile pushMobile)
    {
        return pushMobileMapper.insertPushMobile(pushMobile);
    }

    /**
     * 修改推送手机号管理
     * 
     * @param pushMobile 推送手机号管理
     * @return 结果
     */
    @Override
    public int updatePushMobile(PushMobile pushMobile)
    {
        return pushMobileMapper.updatePushMobile(pushMobile);
    }

    /**
     * 删除推送手机号管理对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deletePushMobileByIds(String ids)
    {
        return pushMobileMapper.deletePushMobileByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除推送手机号管理信息
     * 
     * @param mobileId 推送手机号管理ID
     * @return 结果
     */
    @Override
    public int deletePushMobileById(Long mobileId)
    {
        return pushMobileMapper.deletePushMobileById(mobileId);
    }
}
