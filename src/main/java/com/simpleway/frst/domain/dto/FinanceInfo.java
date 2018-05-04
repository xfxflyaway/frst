package com.simpleway.frst.domain.dto;

import java.util.Date;

public class FinanceInfo {
    private Long financeId;

    private String financeName;

    private Integer financeType;

    private Long areaId;

    private String relaMan;

    private String relaMobile;

    private Integer state;

    private Date createTime;

    private Date updateTime;

    public FinanceInfo(Long financeId, String financeName, Integer financeType, Long areaId, String relaMan, String relaMobile, Integer state, Date createTime, Date updateTime) {
        this.financeId = financeId;
        this.financeName = financeName;
        this.financeType = financeType;
        this.areaId = areaId;
        this.relaMan = relaMan;
        this.relaMobile = relaMobile;
        this.state = state;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public FinanceInfo() {
        super();
    }

    public Long getFinanceId() {
        return financeId;
    }

    public void setFinanceId(Long financeId) {
        this.financeId = financeId;
    }

    public String getFinanceName() {
        return financeName;
    }

    public void setFinanceName(String financeName) {
        this.financeName = financeName == null ? null : financeName.trim();
    }

    public Integer getFinanceType() {
        return financeType;
    }

    public void setFinanceType(Integer financeType) {
        this.financeType = financeType;
    }

    public Long getAreaId() {
        return areaId;
    }

    public void setAreaId(Long areaId) {
        this.areaId = areaId;
    }

    public String getRelaMan() {
        return relaMan;
    }

    public void setRelaMan(String relaMan) {
        this.relaMan = relaMan == null ? null : relaMan.trim();
    }

    public String getRelaMobile() {
        return relaMobile;
    }

    public void setRelaMobile(String relaMobile) {
        this.relaMobile = relaMobile == null ? null : relaMobile.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}