package com.simpleway.frst.request.company;

import javax.validation.constraints.NotNull;

/**
 * @author xiongfeixiang
 * @title LoanCompanyAccountForm
 * @date 2017/9/29 10:48
 * @since v1.0.0
 */
public class LoanCompanyAccountForm {
    private Long accountId;
    /**
     * 公司id
     */
    @NotNull
    private Long companyId;
    /**
     * 公司名称
     */
    @NotNull
    private String companyName;
    /**
     * 开户行
     */
    @NotNull
    private String bank;
    /**
     * 开户账号
     */
    @NotNull
    private String bankAccount;
    /**
     * 账户性质1、基本账户  2、一般账户  3、专项账户  默认1
     */
    @NotNull
    private Integer accountProperty;
    /**
     * 备注
     */
    private String remark;

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
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
        this.companyName = companyName;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public Integer getAccountProperty() {
        return accountProperty;
    }

    public void setAccountProperty(Integer accountProperty) {
        this.accountProperty = accountProperty;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
