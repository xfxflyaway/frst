package com.simpleway.frst.request.finance;

import javax.validation.constraints.NotNull;

/**
 * @author xiongfeixiang
 * @title FinanceSupervisorForm
 * @date 2017/9/28 17:09
 * @since v1.0.0
 */
public class FinanceSupervisorForm {
    private Long id;
    /**
     * 监管人员名称
     */
    @NotNull
    private String supervisorName;

    /**
     * 金融办id
     */
    @NotNull
    private Long financeId;

    /**
     * 电话号码
     */
    @NotNull
    private String telephone;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
