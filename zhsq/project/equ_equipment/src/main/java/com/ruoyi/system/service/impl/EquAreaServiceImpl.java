package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.EquAreaMapper;
import com.ruoyi.system.domain.EquArea;
import com.ruoyi.system.service.IEquAreaService;
import com.ruoyi.common.core.text.Convert;

/**
 * 设备区域Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-10-14
 */
@Service
public class EquAreaServiceImpl implements IEquAreaService 
{
    @Autowired
    private EquAreaMapper equAreaMapper;

    /**
     * 查询设备区域
     * 
     * @param areaId 设备区域ID
     * @return 设备区域
     */
    @Override
    public EquArea selectEquAreaById(Long areaId)
    {
        return equAreaMapper.selectEquAreaById(areaId);
    }

    /**
     * 查询设备区域列表
     * 
     * @param equArea 设备区域
     * @return 设备区域
     */
    @Override
    public List<EquArea> selectEquAreaList(EquArea equArea)
    {
        return equAreaMapper.selectEquAreaList(equArea);
    }

    /**
     * 新增设备区域
     * 
     * @param equArea 设备区域
     * @return 结果
     */
    @Override
    public int insertEquArea(EquArea equArea)
    {
        return equAreaMapper.insertEquArea(equArea);
    }

    /**
     * 修改设备区域
     * 
     * @param equArea 设备区域
     * @return 结果
     */
    @Override
    public int updateEquArea(EquArea equArea)
    {
        return equAreaMapper.updateEquArea(equArea);
    }

    /**
     * 删除设备区域对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteEquAreaByIds(String ids)
    {
        return equAreaMapper.deleteEquAreaByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除设备区域信息
     * 
     * @param areaId 设备区域ID
     * @return 结果
     */
    @Override
    public int deleteEquAreaById(Long areaId)
    {
        return equAreaMapper.deleteEquAreaById(areaId);
    }
}
