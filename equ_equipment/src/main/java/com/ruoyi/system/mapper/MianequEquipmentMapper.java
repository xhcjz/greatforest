package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.MianequEquipment;

/**
 * 主机列Mapper接口
 * 
 * @author ruoyi
 * @date 2020-10-13
 */
public interface MianequEquipmentMapper 
{
    /**
     * 查询主机列
     * 
     * @param mianequId 主机列ID
     * @return 主机列
     */
    public MianequEquipment selectMianequEquipmentById(Long mianequId);

    /**
     * 查询主机列列表
     * 
     * @param mianequEquipment 主机列
     * @return 主机列集合
     */
    public List<MianequEquipment> selectMianequEquipmentList(MianequEquipment mianequEquipment);

    /**
     * 新增主机列
     * 
     * @param mianequEquipment 主机列
     * @return 结果
     */
    public int insertMianequEquipment(MianequEquipment mianequEquipment);

    /**
     * 修改主机列
     * 
     * @param mianequEquipment 主机列
     * @return 结果
     */
    public int updateMianequEquipment(MianequEquipment mianequEquipment);

    /**
     * 删除主机列
     * 
     * @param mianequId 主机列ID
     * @return 结果
     */
    public int deleteMianequEquipmentById(Long mianequId);

    /**
     * 批量删除主机列
     * 
     * @param mianequIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteMianequEquipmentByIds(String[] mianequIds);
}
