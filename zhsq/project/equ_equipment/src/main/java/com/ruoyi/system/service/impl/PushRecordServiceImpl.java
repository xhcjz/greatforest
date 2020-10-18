package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.PushRecordMapper;
import com.ruoyi.system.domain.PushRecord;
import com.ruoyi.system.service.IPushRecordService;
import com.ruoyi.common.core.text.Convert;

/**
 * 推送记录管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-10-14
 */
@Service
public class PushRecordServiceImpl implements IPushRecordService 
{
    @Autowired
    private PushRecordMapper pushRecordMapper;

    /**
     * 查询推送记录管理
     * 
     * @param recordId 推送记录管理ID
     * @return 推送记录管理
     */
    @Override
    public PushRecord selectPushRecordById(Long recordId)
    {
        return pushRecordMapper.selectPushRecordById(recordId);
    }

    /**
     * 查询推送记录管理列表
     * 
     * @param pushRecord 推送记录管理
     * @return 推送记录管理
     */
    @Override
    public List<PushRecord> selectPushRecordList(PushRecord pushRecord)
    {
        return pushRecordMapper.selectPushRecordList(pushRecord);
    }

    /**
     * 新增推送记录管理
     * 
     * @param pushRecord 推送记录管理
     * @return 结果
     */
    @Override
    public int insertPushRecord(PushRecord pushRecord)
    {
        pushRecord.setCreateTime(DateUtils.getNowDate());
        return pushRecordMapper.insertPushRecord(pushRecord);
    }

    /**
     * 修改推送记录管理
     * 
     * @param pushRecord 推送记录管理
     * @return 结果
     */
    @Override
    public int updatePushRecord(PushRecord pushRecord)
    {
        return pushRecordMapper.updatePushRecord(pushRecord);
    }

    /**
     * 删除推送记录管理对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deletePushRecordByIds(String ids)
    {
        return pushRecordMapper.deletePushRecordByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除推送记录管理信息
     * 
     * @param recordId 推送记录管理ID
     * @return 结果
     */
    @Override
    public int deletePushRecordById(Long recordId)
    {
        return pushRecordMapper.deletePushRecordById(recordId);
    }
}
