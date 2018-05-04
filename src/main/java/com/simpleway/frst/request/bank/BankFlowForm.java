package com.simpleway.frst.request.bank;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author xiongfeixiang
 * @title BankFlowForm
 * @date 2017/10/2 12:47
 * @since v1.0.0
 */
public class BankFlowForm {
    @NotNull
    private String coreSerialNo;
    @NotNull
    private Date transactionDate;
    @NotNull
    private String transactionTime;
    @NotNull
    private String currency;
    @NotNull
    private String outIn;
    @NotNull
    private String forwardFlag;
    @NotNull
    private BigDecimal transctionAmount;
    @NotNull
    private BigDecimal accountBalance;
    @NotNull
    private String tradeBank;
    @NotNull
    private String tradeAccountName;
    @NotNull
    private String tradeAccountNo;
    @NotNull
    private String counterBank;
    @NotNull
    private String counterAccountName;
    @NotNull
    private String counterAccountNo;
    @NotNull
    private String channel;
    @NotNull
    private String purpose;
    @NotNull
    private String remark;
    @NotNull
    private String postscript;
    @NotNull
    private String transactionInfo;
    @NotNull
    private String transactionDesc;
    @NotNull
    private String transactionExplain;
    @NotNull
    private String businessSummary;

    public String getCoreSerialNo() {
        return coreSerialNo;
    }

    public void setCoreSerialNo(String coreSerialNo) {
        this.coreSerialNo = coreSerialNo;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getTransactionTime() {
        return transactionTime;
    }

    public void setTransactionTime(String transactionTime) {
        this.transactionTime = transactionTime;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getOutIn() {
        return outIn;
    }

    public void setOutIn(String outIn) {
        this.outIn = outIn;
    }

    public String getForwardFlag() {
        return forwardFlag;
    }

    public void setForwardFlag(String forwardFlag) {
        this.forwardFlag = forwardFlag;
    }

    public BigDecimal getTransctionAmount() {
        return transctionAmount;
    }

    public void setTransctionAmount(BigDecimal transctionAmount) {
        this.transctionAmount = transctionAmount;
    }

    public BigDecimal getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(BigDecimal accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getTradeBank() {
        return tradeBank;
    }

    public void setTradeBank(String tradeBank) {
        this.tradeBank = tradeBank;
    }

    public String getTradeAccountName() {
        return tradeAccountName;
    }

    public void setTradeAccountName(String tradeAccountName) {
        this.tradeAccountName = tradeAccountName;
    }

    public String getTradeAccountNo() {
        return tradeAccountNo;
    }

    public void setTradeAccountNo(String tradeAccountNo) {
        this.tradeAccountNo = tradeAccountNo;
    }

    public String getCounterBank() {
        return counterBank;
    }

    public void setCounterBank(String counterBank) {
        this.counterBank = counterBank;
    }

    public String getCounterAccountName() {
        return counterAccountName;
    }

    public void setCounterAccountName(String counterAccountName) {
        this.counterAccountName = counterAccountName;
    }

    public String getCounterAccountNo() {
        return counterAccountNo;
    }

    public void setCounterAccountNo(String counterAccountNo) {
        this.counterAccountNo = counterAccountNo;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getPostscript() {
        return postscript;
    }

    public void setPostscript(String postscript) {
        this.postscript = postscript;
    }

    public String getTransactionInfo() {
        return transactionInfo;
    }

    public void setTransactionInfo(String transactionInfo) {
        this.transactionInfo = transactionInfo;
    }

    public String getTransactionDesc() {
        return transactionDesc;
    }

    public void setTransactionDesc(String transactionDesc) {
        this.transactionDesc = transactionDesc;
    }

    public String getTransactionExplain() {
        return transactionExplain;
    }

    public void setTransactionExplain(String transactionExplain) {
        this.transactionExplain = transactionExplain;
    }

    public String getBusinessSummary() {
        return businessSummary;
    }

    public void setBusinessSummary(String businessSummary) {
        this.businessSummary = businessSummary;
    }
}
