package com.simpleway.frst.request.operatelog;

import com.simpleway.frst.request.base.BaseWhereReq;

/**
 * @author xiongfeixiang
 * @title OperateLogQuery
 * @date 2017/10/3 20:30
 * @since v1.0.0
 */
public class OperateLogQuery extends BaseWhereReq{

    private String operateDesc;

    private Integer operateType;

    private Long actionMan;

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

    public Long getActionMan() {
        return actionMan;
    }

    public void setActionMan(Long actionMan) {
        this.actionMan = actionMan;
    }
}
