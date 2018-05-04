package com.simpleway.frst.eventbus.listener.events;

import java.util.Date;

/**
 * @author xiongfeixiang
 * @title OperateLogEvent
 * @date 2017/10/2 15:16
 * @since v1.0.0
 */
public class OperateLogEvent {

    private String tableName ;

    private String operateDesc;

    private Integer operateType;

    private Date updateTime = new Date();

    private Long actionMan;

    public OperateLogEvent() {
    }


    public OperateLogEvent(String tableName, String operateDesc, Integer operateType, Long actionMan) {
        this.tableName = tableName;
        this.operateDesc = operateDesc;
        this.operateType = operateType;
        this.actionMan = actionMan;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getOperateDesc() {
        return operateDesc;
    }

    public void setOperateDesc(String operateDesc) {
        this.operateDesc = operateDesc;
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
