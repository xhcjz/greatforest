package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 推送记录管理对象 push_record
 * 
 * @author ruoyi
 * @date 2020-10-14
 */
public class PushRecord extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键id */
    private Long recordId;

    /** 类型 */
    @Excel(name = "类型")
    private Long recordType;

    /** 是否成功 */
    @Excel(name = "是否成功")
    private Long recordFalse;

    public void setRecordId(Long recordId) 
    {
        this.recordId = recordId;
    }

    public Long getRecordId() 
    {
        return recordId;
    }
    public void setRecordType(Long recordType) 
    {
        this.recordType = recordType;
    }

    public Long getRecordType() 
    {
        return recordType;
    }
    public void setRecordFalse(Long recordFalse) 
    {
        this.recordFalse = recordFalse;
    }

    public Long getRecordFalse() 
    {
        return recordFalse;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("recordId", getRecordId())
            .append("recordType", getRecordType())
            .append("recordFalse", getRecordFalse())
            .append("createTime", getCreateTime())
            .toString();
    }
}
