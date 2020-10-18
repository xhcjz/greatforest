package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.EquEquipment;

/**
 * 传感器列Mapper接口
 * 
 * @author ruoyi
 * @date 2020-09-27
 */
public interface EquEquipmentMapper 
{
    /**
     * 查询传感器列
     * 
     * @param equId 传感器列ID
     * @return 传感器列
     */
    public EquEquipment selectEquEquipmentById(Long equId);

    /**
     * 查询传感器列列表
     * 
     * @param equEquipment 传感器列
     * @return 传感器列集合
     */
    public List<EquEquipment> selectEquEquipmentList(EquEquipment equEquipment);

    /**
     * 新增传感器列
     * 
     * @param equEquipment 传感器列
     * @return 结果
     */
    public int insertEquEquipment(EquEquipment equEquipment);

    /**
     * 修改传感器列
     * 
     * @param equEquipment 传感器列
     * @return 结果
     */
    public int updateEquEquipment(EquEquipment equEquipment);

    /**
     * 删除传感器列
     * 
     * @param equId 传感器列ID
     * @return 结果
     */
    public int deleteEquEquipmentById(Long equId);

    /**
     * 批量删除传感器列
     * 
     * @param equIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteEquEquipmentByIds(String[] equIds);
}
