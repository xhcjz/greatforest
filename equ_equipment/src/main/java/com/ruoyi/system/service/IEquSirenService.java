package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.EquSiren;

/**
 * 设备报警记录管理Service接口
 * 
 * @author ruoyi
 * @date 2020-10-14
 */
public interface IEquSirenService 
{
    /**
     * 查询设备报警记录管理
     * 
     * @param sirenId 设备报警记录管理ID
     * @return 设备报警记录管理
     */
    public EquSiren selectEquSirenById(Long sirenId);

    /**
     * 查询设备报警记录管理列表
     * 
     * @param equSiren 设备报警记录管理
     * @return 设备报警记录管理集合
     */
    public List<EquSiren> selectEquSirenList(EquSiren equSiren);

    /**
     * 新增设备报警记录管理
     * 
     * @param equSiren 设备报警记录管理
     * @return 结果
     */
    public int insertEquSiren(EquSiren equSiren);

    /**
     * 修改设备报警记录管理
     * 
     * @param equSiren 设备报警记录管理
     * @return 结果
     */
    public int updateEquSiren(EquSiren equSiren);

    /**
     * 批量删除设备报警记录管理
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteEquSirenByIds(String ids);

    /**
     * 删除设备报警记录管理信息
     * 
     * @param sirenId 设备报警记录管理ID
     * @return 结果
     */
    public int deleteEquSirenById(Long sirenId);
}
