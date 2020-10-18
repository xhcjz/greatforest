package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.MianequEquipmentMapper;
import com.ruoyi.system.domain.MianequEquipment;
import com.ruoyi.system.service.IMianequEquipmentService;
import com.ruoyi.common.core.text.Convert;

/**
 * 主机列Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-10-13
 */
@Service
public class MianequEquipmentServiceImpl implements IMianequEquipmentService 
{
    @Autowired
    private MianequEquipmentMapper mianequEquipmentMapper;

    /**
     * 查询主机列
     * 
     * @param mianequId 主机列ID
     * @return 主机列
     */
    @Override
    public MianequEquipment selectMianequEquipmentById(Long mianequId)
    {
        return mianequEquipmentMapper.selectMianequEquipmentById(mianequId);
    }

    /**
     * 查询主机列列表
     * 
     * @param mianequEquipment 主机列
     * @return 主机列
     */
    @Override
    public List<MianequEquipment> selectMianequEquipmentList(MianequEquipment mianequEquipment)
    {
        return mianequEquipmentMapper.selectMianequEquipmentList(mianequEquipment);
    }

    /**
     * 新增主机列
     * 
     * @param mianequEquipment 主机列
     * @return 结果
     */
    @Override
    public int insertMianequEquipment(MianequEquipment mianequEquipment)
    {
        return mianequEquipmentMapper.insertMianequEquipment(mianequEquipment);
    }

    /**
     * 修改主机列
     * 
     * @param mianequEquipment 主机列
     * @return 结果
     */
    @Override
    public int updateMianequEquipment(MianequEquipment mianequEquipment)
    {
        return mianequEquipmentMapper.updateMianequEquipment(mianequEquipment);
    }

    /**
     * 删除主机列对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteMianequEquipmentByIds(String ids)
    {
        return mianequEquipmentMapper.deleteMianequEquipmentByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除主机列信息
     * 
     * @param mianequId 主机列ID
     * @return 结果
     */
    @Override
    public int deleteMianequEquipmentById(Long mianequId)
    {
        return mianequEquipmentMapper.deleteMianequEquipmentById(mianequId);
    }
}
