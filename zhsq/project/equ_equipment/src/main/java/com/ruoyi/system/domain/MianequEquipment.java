package com.ruoyi.system.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 主机列对象 mianequ_equipment
 * 
 * @author ruoyi
 * @date 2020-10-13
 */
public class MianequEquipment extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键id */
    private Long mianequId;

    /** 区域id */
    @Excel(name = "区域id")
    private Long areaId;

    /** 主机编号 */
    @Excel(name = "主机编号")
    private Long mianequMainid;

    /** 主机名称 */
    @Excel(name = "主机名称")
    private String mianequName;

    /** 主机状态 */
    @Excel(name = "主机状态")
    private Long mianequState;

    /** 运行时间 */
    @Excel(name = "运行时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date mianequTime;

    /** 耗电量 */
    @Excel(name = "耗电量")
    private Long mianequPower;

    /** 电压 */
    @Excel(name = "电压")
    private Long mianequVoltage;

    /** 经度 */
    @Excel(name = "经度")
    private Long mianequLongitude;

    /** 纬度 */
    @Excel(name = "纬度")
    private Long mianequLatitude;

    public void setMianequId(Long mianequId) 
    {
        this.mianequId = mianequId;
    }

    public Long getMianequId() 
    {
        return mianequId;
    }
    public void setAreaId(Long areaId) 
    {
        this.areaId = areaId;
    }

    public Long getAreaId() 
    {
        return areaId;
    }
    public void setMianequMainid(Long mianequMainid) 
    {
        this.mianequMainid = mianequMainid;
    }

    public Long getMianequMainid() 
    {
        return mianequMainid;
    }
    public void setMianequName(String mianequName) 
    {
        this.mianequName = mianequName;
    }

    public String getMianequName() 
    {
        return mianequName;
    }
    public void setMianequState(Long mianequState) 
    {
        this.mianequState = mianequState;
    }

    public Long getMianequState() 
    {
        return mianequState;
    }
    public void setMianequTime(Date mianequTime) 
    {
        this.mianequTime = mianequTime;
    }

    public Date getMianequTime() 
    {
        return mianequTime;
    }
    public void setMianequPower(Long mianequPower) 
    {
        this.mianequPower = mianequPower;
    }

    public Long getMianequPower() 
    {
        return mianequPower;
    }
    public void setMianequVoltage(Long mianequVoltage) 
    {
        this.mianequVoltage = mianequVoltage;
    }

    public Long getMianequVoltage() 
    {
        return mianequVoltage;
    }
    public void setMianequLongitude(Long mianequLongitude) 
    {
        this.mianequLongitude = mianequLongitude;
    }

    public Long getMianequLongitude() 
    {
        return mianequLongitude;
    }
    public void setMianequLatitude(Long mianequLatitude) 
    {
        this.mianequLatitude = mianequLatitude;
    }

    public Long getMianequLatitude() 
    {
        return mianequLatitude;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("mianequId", getMianequId())
            .append("areaId", getAreaId())
            .append("mianequMainid", getMianequMainid())
            .append("mianequName", getMianequName())
            .append("mianequState", getMianequState())
            .append("mianequTime", getMianequTime())
            .append("mianequPower", getMianequPower())
            .append("mianequVoltage", getMianequVoltage())
            .append("mianequLongitude", getMianequLongitude())
            .append("mianequLatitude", getMianequLatitude())
            .toString();
    }
}
