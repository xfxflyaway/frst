package com.simpleway.frst.request.company;

import com.simpleway.frst.request.base.BaseWhereReq;

/**
 * @author xiongfeixiang
 * @title LoanCompanyAccountQuery
 * @date 2017/9/29 13:48
 * @since v1.0.0
 */
public class LoanCompanyAccountQuery extends BaseWhereReq {
    /**
     * 公司id
     */
    private Long companyId;
    /**
     * 公司名称
     */
    private String companyName;
    /**
     * 开户行
     */
    private String bank;
    /**
     * 开户账号
     */
    private String bankAccount;
    /**
     * 账户性质1、基本账户  2、一般账户  3、专项账户  默认1
     */
    private Integer accountProperty;

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
}
