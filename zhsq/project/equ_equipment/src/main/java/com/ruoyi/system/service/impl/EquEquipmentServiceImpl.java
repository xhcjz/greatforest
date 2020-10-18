package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.EquEquipmentMapper;
import com.ruoyi.system.domain.EquEquipment;
import com.ruoyi.system.service.IEquEquipmentService;
import com.ruoyi.common.core.text.Convert;

/**
 * 传感器列Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-09-27
 */
@Service
public class EquEquipmentServiceImpl implements IEquEquipmentService 
{
    @Autowired
    private EquEquipmentMapper equEquipmentMapper;

    /**
     * 查询传感器列
     * 
     * @param equId 传感器列ID
     * @return 传感器列
     */
    @Override
    public EquEquipment selectEquEquipmentById(Long equId)
    {
        return equEquipmentMapper.selectEquEquipmentById(equId);
    }

    /**
     * 查询传感器列列表
     * 
     * @param equEquipment 传感器列
     * @return 传感器列
     */
    @Override
    public List<EquEquipment> selectEquEquipmentList(EquEquipment equEquipment)
    {
        return equEquipmentMapper.selectEquEquipmentList(equEquipment);
    }

    /**
     * 新增传感器列
     * 
     * @param equEquipment 传感器列
     * @return 结果
     */
    @Override
    public int insertEquEquipment(EquEquipment equEquipment)
    {
        return equEquipmentMapper.insertEquEquipment(equEquipment);
    }

    /**
     * 修改传感器列
     * 
     * @param equEquipment 传感器列
     * @return 结果
     */
    @Override
    public int updateEquEquipment(EquEquipment equEquipment)
    {
        return equEquipmentMapper.updateEquEquipment(equEquipment);
    }

    /**
     * 删除传感器列对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteEquEquipmentByIds(String ids)
    {
        return equEquipmentMapper.deleteEquEquipmentByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除传感器列信息
     * 
     * @param equId 传感器列ID
     * @return 结果
     */
    @Override
    public int deleteEquEquipmentById(Long equId)
    {
        return equEquipmentMapper.deleteEquEquipmentById(equId);
    }
}
