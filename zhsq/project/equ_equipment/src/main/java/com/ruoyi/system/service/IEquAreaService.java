package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.EquArea;

/**
 * 设备区域Service接口
 * 
 * @author ruoyi
 * @date 2020-10-14
 */
public interface IEquAreaService 
{
    /**
     * 查询设备区域
     * 
     * @param areaId 设备区域ID
     * @return 设备区域
     */
    public EquArea selectEquAreaById(Long areaId);

    /**
     * 查询设备区域列表
     * 
     * @param equArea 设备区域
     * @return 设备区域集合
     */
    public List<EquArea> selectEquAreaList(EquArea equArea);

    /**
     * 新增设备区域
     * 
     * @param equArea 设备区域
     * @return 结果
     */
    public int insertEquArea(EquArea equArea);

    /**
     * 修改设备区域
     * 
     * @param equArea 设备区域
     * @return 结果
     */
    public int updateEquArea(EquArea equArea);

    /**
     * 批量删除设备区域
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteEquAreaByIds(String ids);

    /**
     * 删除设备区域信息
     * 
     * @param areaId 设备区域ID
     * @return 结果
     */
    public int deleteEquAreaById(Long areaId);
}
