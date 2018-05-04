package com.simpleway.frst.domain.dto;

import java.math.BigDecimal;
import java.util.Date;

public class WarnInfo {
    private Long warnId;

    private Long companyId;

    private String companyName;
    /**
     * 1：还贷预警  2：融资矩阵预警
     */
    private Integer warnType;
    /**
     * 预警金额
     */
    private BigDecimal warnAmount;
    /**
     * 预警业务id
     * 对应的各自业务表的id值
     */
    private Long warnBusiId;
    /**
     * 预警时间
     */
    private Date warnTime;
    /**
     * 预警描述
     */
    private String warnDesc;

    public WarnInfo(Long warnId, Long companyId, String companyName, Integer warnType, BigDecimal warnAmount, Long warnBusiId, Date warnTime, String warnDesc) {
        this.warnId = warnId;
        this.companyId = companyId;
        this.companyName = companyName;
        this.warnType = warnType;
        this.warnAmount = warnAmount;
        this.warnBusiId = warnBusiId;
        this.warnTime = warnTime;
        this.warnDesc = warnDesc;
    }

    public WarnInfo() {
        super();
    }

    public Long getWarnId() {
        return warnId;
    }

    public void setWarnId(Long warnId) {
        this.warnId = warnId;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public Integer getWarnType() {
        return warnType;
    }

    public void setWarnType(Integer warnType) {
        this.warnType = warnType;
    }

    public BigDecimal getWarnAmount() {
        return warnAmount;
    }

    public void setWarnAmount(BigDecimal warnAmount) {
        this.warnAmount = warnAmount;
    }

    public Long getWarnBusiId() {
        return warnBusiId;
    }

    public void setWarnBusiId(Long warnBusiId) {
        this.warnBusiId = warnBusiId;
    }

    public Date getWarnTime() {
        return warnTime;
    }

    public void setWarnTime(Date warnTime) {
        this.warnTime = warnTime;
    }

    public String getWarnDesc() {
        return warnDesc;
    }

    public void setWarnDesc(String warnDesc) {
        this.warnDesc = warnDesc == null ? null : warnDesc.trim();
    }
}