package com.simpleway.frst.request.company;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author xiongfeixiang
 * @title LoanBusinessForm
 * @date 2017/10/1 14:55
 * @since v1.0.0
 */
public class LoanBusinessForm {
    private Long id;
    /**
     * 还款人姓名
     */
    @NotNull
    private String loanName;
    /**
     * 还款人账号
     */
    @NotNull
    private String loanAccountNo;
    /**
     * 还款人身份号码
     */
    @NotNull
    private String loanIdentify;
    /**
     * 贷款金额
     */
    @NotNull
    private BigDecimal loanAmount;
    /**
     * 还款公司账号
     */
    @NotNull
    private String bankAccount;
    /**
     * 公司id
     */
    private Long companyId;
    /**
     * 还款周期
     */
    @NotNull
    private Integer returnMonth;
    /**
     * 每月还款日期
     */
    @NotNull
    private Integer returnDay;
    /**
     * 每期还款金额
     */
    @NotNull
    private BigDecimal oneAmount;
    /**
     * 开始还款日期
     */
    @NotNull
    private Date beginDate;
    /**
     * 结束还款日期
     */
    @NotNull
    private Date endDate;

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
        this.loanName = loanName;
    }

    public String getLoanAccountNo() {
        return loanAccountNo;
    }

    public void setLoanAccountNo(String loanAccountNo) {
        this.loanAccountNo = loanAccountNo;
    }

    public String getLoanIdentify() {
        return loanIdentify;
    }

    public void setLoanIdentify(String loanIdentify) {
        this.loanIdentify = loanIdentify;
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
        this.bankAccount = bankAccount;
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
}
