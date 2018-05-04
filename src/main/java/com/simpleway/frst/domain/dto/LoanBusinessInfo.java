package com.simpleway.frst.domain.dto;

import java.math.BigDecimal;
import java.util.Date;

public class LoanBusinessInfo {
    private Long id;

    /**
     * 还款人姓名
     */
    private String loanName;
    /**
     * 还款人账号
     */
    private String loanAccountNo;
    /**
     * 还款人身份号码
     */
    private String loanIdentify;
    /**
     * 贷款金额
     */
    private BigDecimal loanAmount;
    /**
     * 还款公司账号
     */
    private String bankAccount;
    /**
     * 公司id
     */
    private Long companyId;
    /**
     * 还款周期
     */
    private Integer returnMonth;
    /**
     * 每月还款日期
     */
    private Integer returnDay;
    /**
     * 每期还款金额
     */
    private BigDecimal oneAmount;
    /**
     * 开始还款日期
     */
    private Date beginDate;
    /**
     * 结束还款日期
     */
    private Date endDate;

    private Date createTime;
    /**
     * 状态【0未放贷,1放贷中，2.已完结,3.还贷异常】
     */
    private Integer state;

    public LoanBusinessInfo(Long id, String loanName, String loanAccountNo, String loanIdentify, BigDecimal loanAmount, String bankAccount, Long companyId, Integer returnMonth, Integer returnDay, BigDecimal oneAmount, Date beginDate, Date endDate, Date createTime, Integer state) {
        this.id = id;
        this.loanName = loanName;
        this.loanAccountNo = loanAccountNo;
        this.loanIdentify = loanIdentify;
        this.loanAmount = loanAmount;
        this.bankAccount = bankAccount;
        this.companyId = companyId;
        this.returnMonth = returnMonth;
        this.returnDay = returnDay;
        this.oneAmount = oneAmount;
        this.beginDate = beginDate;
        this.endDate = endDate;
        this.createTime = createTime;
        this.state = state;
    }

    public LoanBusinessInfo() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLoanName() {
        return loanName;
    }

    public void setLoanName(String loanName) {
        this.loanName = loanName == null ? null : loanName.trim();
    }

    public String getLoanAccountNo() {
        return loanAccountNo;
    }

    public void setLoanAccountNo(String loanAccountNo) {
        this.loanAccountNo = loanAccountNo == null ? null : loanAccountNo.trim();
    }

    public String getLoanIdentify() {
        return loanIdentify;
    }

    public void setLoanIdentify(String loanIdentify) {
        this.loanIdentify = loanIdentify == null ? null : loanIdentify.trim();
    }

    public BigDecimal getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(BigDecimal loanAmount) {
        this.loanAmount = loanAmount;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount == null ? null : bankAccount.trim();
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Integer getReturnMonth() {
        return returnMonth;
    }

    public void setReturnMonth(Integer returnMonth) {
        this.returnMonth = returnMonth;
    }

    public Integer getReturnDay() {
        return returnDay;
    }

    public void setReturnDay(Integer returnDay) {
        this.returnDay = returnDay;
    }

    public BigDecimal getOneAmount() {
        return oneAmount;
    }

    public void setOneAmount(BigDecimal oneAmount) {
        this.oneAmount = oneAmount;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}