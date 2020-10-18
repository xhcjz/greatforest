package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 推送手机号管理对象 push_mobile
 * 
 * @author ruoyi
 * @date 2020-10-14
 */
public class PushMobile extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键id */
    private Long mobileId;

    /** 手机号 */
    @Excel(name = "手机号")
    private Long mobileNumber;

    /** 姓名 */
    @Excel(name = "姓名")
    private String mobileName;

    /** 时间 */
    @Excel(name = "时间")
    private String mobileTime;

    public void setMobileId(Long mobileId) 
    {
        this.mobileId = mobileId;
    }

    public Long getMobileId() 
    {
        return mobileId;
    }
    public void setMobileNumber(Long mobileNumber) 
    {
        this.mobileNumber = mobileNumber;
    }

    public Long getMobileNumber() 
    {
        return mobileNumber;
    }
    public void setMobileName(String mobileName) 
    {
        this.mobileName = mobileName;
    }

    public String getMobileName() 
    {
        return mobileName;
    }
    public void setMobileTime(String mobileTime) 
    {
        this.mobileTime = mobileTime;
    }

    public String getMobileTime() 
    {
        return mobileTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("mobileId", getMobileId())
            .append("mobileNumber", getMobileNumber())
            .append("mobileName", getMobileName())
            .append("mobileTime", getMobileTime())
            .toString();
    }
}
