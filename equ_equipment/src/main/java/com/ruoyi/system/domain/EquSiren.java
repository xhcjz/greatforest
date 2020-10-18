package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 设备报警记录管理对象 equ_siren
 * 
 * @author ruoyi
 * @date 2020-10-14
 */
public class EquSiren extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键id */
    private Long sirenId;

    /** 主机id */
    @Excel(name = "主机id")
    private Long equMianid;

    /** 报警的传感器id */
    @Excel(name = "报警的传感器id")
    private String equCid;

    /** 报警详细时间 */
    @Excel(name = "报警详细时间")
    private String sirenTime;

    /** 报警类型(1级,2级,3级) */
    @Excel(name = "报警类型(1级,2级,3级)")
    private Long sirenType;

    /** 报警种类(地震,泥石流,滑坡) */
    @Excel(name = "报警种类(地震,泥石流,滑坡)")
    private Long sirenRank;

    public void setSirenId(Long sirenId) 
    {
        this.sirenId = sirenId;
    }

    public Long getSirenId() 
    {
        return sirenId;
    }
    public void setEquMianid(Long equMianid) 
    {
        this.equMianid = equMianid;
    }

    public Long getEquMianid() 
    {
        return equMianid;
    }
    public void setEquCid(String equCid) 
    {
        this.equCid = equCid;
    }

    public String getEquCid() 
    {
        return equCid;
    }
    public void setSirenTime(String sirenTime) 
    {
        this.sirenTime = sirenTime;
    }

    public String getSirenTime() 
    {
        return sirenTime;
    }
    public void setSirenType(Long sirenType) 
    {
        this.sirenType = sirenType;
    }

    public Long getSirenType() 
    {
        return sirenType;
    }
    public void setSirenRank(Long sirenRank) 
    {
        this.sirenRank = sirenRank;
    }

    public Long getSirenRank() 
    {
        return sirenRank;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("sirenId", getSirenId())
            .append("equMianid", getEquMianid())
            .append("equCid", getEquCid())
            .append("sirenTime", getSirenTime())
            .append("sirenType", getSirenType())
            .append("sirenRank", getSirenRank())
            .toString();
    }
}
