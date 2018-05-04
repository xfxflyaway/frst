package com.simpleway.frst.request.finance;

import com.simpleway.frst.request.base.BaseWhereReq;

/**
 * @author xiongfeixiang
 * @title FinanceSupervisorQuery
 * @date 2017/9/28 17:11
 * @since v1.0.0
 */
public class FinanceSupervisorQuery extends BaseWhereReq {

    /**
     * 监管人员名称
     */
    private String supervisorName;

    /**
     * 金融办id
     */
    private Long financeId;

    /**
     * 电话号码
     */
    private String telephone;

    public String getSupervisorName() {
        return supervisorName;
    }

    public void setSupervisorName(String supervisorName) {
        this.supervisorName = supervisorName;
    }

    public Long getFinanceId() {
        return financeId;
    }

    public void setFinanceId(Long financeId) {
        this.financeId = financeId;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
