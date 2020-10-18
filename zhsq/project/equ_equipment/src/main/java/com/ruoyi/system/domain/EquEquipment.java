package com.ruoyi.system.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import org.yaml.snakeyaml.events.MappingEndEvent;

import javax.swing.*;

/**
 * 传感器列对象 equ_equipment
 * 
 * @author ruoyi
 * @date 2020-09-27
 */
public class EquEquipment extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键id */
    private Long equId;

    /** 传感器编号 */
    @Excel(name = "传感器编号")
    private Long equCid;

    /** 主机id */
    @Excel(name = "主机id")
    private Long equMianid;

    /** 传感器名称 */
    @Excel(name = "传感器名称")
    private String equName;

    /** 传感器状态(0表示故障,1表示正常) */
    @Excel(name = "传感器状态(0表示故障,1表示正常)")
    private Long equState;

    /** 运行时间 */
    @Excel(name = "运行时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date equTime;

    /** 规格参数 */
    @Excel(name = "规格参数")
    private String equSpecification;

    /** 耗电量 */
    @Excel(name = "耗电量")
    private Long equPower;

    /** 经度 */
    @Excel(name = "经度")
    private Long equLongitude;

    /** 纬度 */
    @Excel(name = "纬度")
    private Long equLatitude;

    /** 辐射范围 */
    @Excel(name = "辐射范围")
    private String equScope;

    /** 电压 */
    @Excel(name = "电压")
    private Long equVoltage;

    public void setEquId(Long equId) 
    {
        this.equId = equId;
    }

    public Long getEquId() 
    {
        return equId;
    }
    public void setEquCid(Long equCid) 
    {
        this.equCid = equCid;
    }

    public Long getEquCid() 
    {
        return equCid;
    }
    public void setEquMianid(Long equMianid) 
    {
        this.equMianid = equMianid;
    }

    public Long getEquMianid() 
    {
        return equMianid;
    }
    public void setEquName(String equName) 
    {
        this.equName = equName;
    }

    public String getEquName() 
    {
        return equName;
    }
    public void setEquState(Long equState) 
    {
        this.equState = equState;
    }

    public Long getEquState() 
    {
        return equState;
    }
    public void setEquTime(Date equTime) 
    {
        this.equTime = equTime;
    }

    public Date getEquTime() 
    {
        return equTime;
    }
    public void setEquSpecification(String equSpecification) 
    {
        this.equSpecification = equSpecification;
    }

    public String getEquSpecification() 
    {
        return equSpecification;
    }
    public void setEquPower(Long equPower) 
    {
        this.equPower = equPower;
    }

    public Long getEquPower() 
    {
        return equPower;
    }
    public void setEquLongitude(Long equLongitude) 
    {
        this.equLongitude = equLongitude;
    }

    public Long getEquLongitude() 
    {
        return equLongitude;
    }
    public void setEquLatitude(Long equLatitude) 
    {
        this.equLatitude = equLatitude;
    }

    public Long getEquLatitude() 
    {
        return equLatitude;
    }
    public void setEquScope(String equScope) 
    {
        this.equScope = equScope;
    }

    public String getEquScope() 
    {
        return equScope;
    }
    public void setEquVoltage(Long equVoltage) 
    {
        this.equVoltage = equVoltage;
    }

    public Long getEquVoltage() 
    {
        return equVoltage;
    }



    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("equId", getEquId())
            .append("equCid", getEquCid())
            .append("equMianid", getEquMianid())
            .append("equName", getEquName())
            .append("equState", getEquState())
            .append("equTime", getEquTime())
            .append("equSpecification", getEquSpecification())
            .append("equPower", getEquPower())
            .append("equLongitude", getEquLongitude())
            .append("equLatitude", getEquLatitude())
            .append("equScope", getEquScope())
            .append("equVoltage", getEquVoltage())
            .toString();
    }
}
