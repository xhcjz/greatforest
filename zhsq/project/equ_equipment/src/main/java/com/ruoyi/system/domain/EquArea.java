package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 设备区域对象 equ_area
 * 
 * @author ruoyi
 * @date 2020-10-14
 */
public class EquArea extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键id */
    private Long areaId;

    /** 区 */
    @Excel(name = "区")
    private String areaRegoin;

    public void setAreaId(Long areaId) 
    {
        this.areaId = areaId;
    }

    public Long getAreaId() 
    {
        return areaId;
    }
    public void setAreaRegoin(String areaRegoin) 
    {
        this.areaRegoin = areaRegoin;
    }

    public String getAreaRegoin() 
    {
        return areaRegoin;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("areaId", getAreaId())
            .append("areaRegoin", getAreaRegoin())
            .toString();
    }
}
