package com.simpleway.frst.domain.dto;

import java.util.Date;

public class SmOperateInfo {
    private Long operateId;

    private String tableName;

    private String operateDesc;

    private Integer operateType;

    private Date updateTime;

    private Long actionMan;

    public SmOperateInfo(Long operateId, String tableName, String operateDesc, Integer operateType, Date updateTime, Long actionMan) {
        this.operateId = operateId;
        this.tableName = tableName;
        this.operateDesc = operateDesc;
        this.operateType = operateType;
        this.updateTime = updateTime;
        this.actionMan = actionMan;
    }

    public SmOperateInfo() {
        super();
    }

    public Long getOperateId() {
        return operateId;
    }

    public void setOperateId(Long operateId) {
        this.operateId = operateId;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName == null ? null : tableName.trim();
    }

    public String getOperateDesc() {
        return operateDesc;
    }

    public void setOperateDesc(String operateDesc) {
        this.operateDesc = operateDesc == null ? null : operateDesc.trim();
    }

    public Integer getOperateType() {
        return operateType;
    }

    public void setOperateType(Integer operateType) {
        this.operateType = operateType;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getActionMan() {
        return actionMan;
    }

    public void setActionMan(Long actionMan) {
        this.actionMan = actionMan;
    }
}