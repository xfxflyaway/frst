package com.simpleway.frst.domain.dto;

public class LoanCompanyAccount {
    private Long accountId;

    private Long companyId;

    private String companyName;

    private String bank;

    private String bankAccount;

    private Integer accountProperty;

    private Integer state;

    private String remark;

    public LoanCompanyAccount(Long accountId, Long companyId, String companyName, String bank, String bankAccount, Integer accountProperty, Integer state, String remark) {
        this.accountId = accountId;
        this.companyId = companyId;
        this.companyName = companyName;
        this.bank = bank;
        this.bankAccount = bankAccount;
        this.accountProperty = accountProperty;
        this.state = state;
        this.remark = remark;
    }

    public LoanCompanyAccount() {
        super();
    }

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
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank == null ? null : bank.trim();
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount == null ? null : bankAccount.trim();
    }

    public Integer getAccountProperty() {
        return accountProperty;
    }

    public void setAccountProperty(Integer accountProperty) {
        this.accountProperty = accountProperty;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}