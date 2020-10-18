package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.PushRecord;

/**
 * 推送记录管理Mapper接口
 * 
 * @author ruoyi
 * @date 2020-10-14
 */
public interface PushRecordMapper 
{
    /**
     * 查询推送记录管理
     * 
     * @param recordId 推送记录管理ID
     * @return 推送记录管理
     */
    public PushRecord selectPushRecordById(Long recordId);

    /**
     * 查询推送记录管理列表
     * 
     * @param pushRecord 推送记录管理
     * @return 推送记录管理集合
     */
    public List<PushRecord> selectPushRecordList(PushRecord pushRecord);

    /**
     * 新增推送记录管理
     * 
     * @param pushRecord 推送记录管理
     * @return 结果
     */
    public int insertPushRecord(PushRecord pushRecord);

    /**
     * 修改推送记录管理
     * 
     * @param pushRecord 推送记录管理
     * @return 结果
     */
    public int updatePushRecord(PushRecord pushRecord);

    /**
     * 删除推送记录管理
     * 
     * @param recordId 推送记录管理ID
     * @return 结果
     */
    public int deletePushRecordById(Long recordId);

    /**
     * 批量删除推送记录管理
     * 
     * @param recordIds 需要删除的数据ID
     * @return 结果
     */
    public int deletePushRecordByIds(String[] recordIds);
}
