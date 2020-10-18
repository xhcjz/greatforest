package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.EquSirenMapper;
import com.ruoyi.system.domain.EquSiren;
import com.ruoyi.system.service.IEquSirenService;
import com.ruoyi.common.core.text.Convert;

/**
 * 设备报警记录管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-10-14
 */
@Service
public class EquSirenServiceImpl implements IEquSirenService 
{
    @Autowired
    private EquSirenMapper equSirenMapper;

    /**
     * 查询设备报警记录管理
     * 
     * @param sirenId 设备报警记录管理ID
     * @return 设备报警记录管理
     */
    @Override
    public EquSiren selectEquSirenById(Long sirenId)
    {
        return equSirenMapper.selectEquSirenById(sirenId);
    }

    /**
     * 查询设备报警记录管理列表
     * 
     * @param equSiren 设备报警记录管理
     * @return 设备报警记录管理
     */
    @Override
    public List<EquSiren> selectEquSirenList(EquSiren equSiren)
    {
        return equSirenMapper.selectEquSirenList(equSiren);
    }

    /**
     * 新增设备报警记录管理
     * 
     * @param equSiren 设备报警记录管理
     * @return 结果
     */
    @Override
    public int insertEquSiren(EquSiren equSiren)
    {
        return equSirenMapper.insertEquSiren(equSiren);
    }

    /**
     * 修改设备报警记录管理
     * 
     * @param equSiren 设备报警记录管理
     * @return 结果
     */
    @Override
    public int updateEquSiren(EquSiren equSiren)
    {
        return equSirenMapper.updateEquSiren(equSiren);
    }

    /**
     * 删除设备报警记录管理对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteEquSirenByIds(String ids)
    {
        return equSirenMapper.deleteEquSirenByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除设备报警记录管理信息
     * 
     * @param sirenId 设备报警记录管理ID
     * @return 结果
     */
    @Override
    public int deleteEquSirenById(Long sirenId)
    {
        return equSirenMapper.deleteEquSirenById(sirenId);
    }
}
