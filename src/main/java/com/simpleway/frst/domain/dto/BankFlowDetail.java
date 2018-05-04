package com.simpleway.frst.domain.dto;

import java.math.BigDecimal;
import java.util.Date;

public class BankFlowDetail {
    private Long id;

    private String coreSerialNo;

    private Date transactionDate;

    private String transactionTime;

    private String currency;

    private String outIn;

    private String forwardFlag;

    private BigDecimal transctionAmount;

    private BigDecimal accountBalance;

    private String tradeBank;

    private String tradeAccountName;

    private String tradeAccountNo;

    private String counterBank;

    private String counterAccountName;

    private String counterAccountNo;

    private String channel;

    private String purpose;

    private String remark;

    private String postscript;

    private String transactionInfo;

    private String transactionDesc;

    private String transactionExplain;

    private String businessSummary;

    public BankFlowDetail(Long id, String coreSerialNo, Date transactionDate, String transactionTime, String currency, String outIn, String forwardFlag, BigDecimal transctionAmount, BigDecimal accountBalance, String tradeBank, String tradeAccountName, String tradeAccountNo, String counterBank, String counterAccountName, String counterAccountNo, String channel, String purpose, String remark, String postscript, String transactionInfo, String transactionDesc, String transactionExplain, String businessSummary) {
        this.id = id;
        this.coreSerialNo = coreSerialNo;
        this.transactionDate = transactionDate;
        this.transactionTime = transactionTime;
        this.currency = currency;
        this.outIn = outIn;
        this.forwardFlag = forwardFlag;
        this.transctionAmount = transctionAmount;
        this.accountBalance = accountBalance;
        this.tradeBank = tradeBank;
        this.tradeAccountName = tradeAccountName;
        this.tradeAccountNo = tradeAccountNo;
        this.counterBank = counterBank;
        this.counterAccountName = counterAccountName;
        this.counterAccountNo = counterAccountNo;
        this.channel = channel;
        this.purpose = purpose;
        this.remark = remark;
        this.postscript = postscript;
        this.transactionInfo = transactionInfo;
        this.transactionDesc = transactionDesc;
        this.transactionExplain = transactionExplain;
        this.businessSummary = businessSummary;
    }

    public BankFlowDetail() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCoreSerialNo() {
        return coreSerialNo;
    }

    public void setCoreSerialNo(String coreSerialNo) {
        this.coreSerialNo = coreSerialNo == null ? null : coreSerialNo.trim();
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
        this.transactionTime = transactionTime == null ? null : transactionTime.trim();
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    public String getOutIn() {
        return outIn;
    }

    public void setOutIn(String outIn) {
        this.outIn = outIn == null ? null : outIn.trim();
    }

    public String getForwardFlag() {
        return forwardFlag;
    }

    public void setForwardFlag(String forwardFlag) {
        this.forwardFlag = forwardFlag == null ? null : forwardFlag.trim();
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
        this.tradeBank = tradeBank == null ? null : tradeBank.trim();
    }

    public String getTradeAccountName() {
        return tradeAccountName;
    }

    public void setTradeAccountName(String tradeAccountName) {
        this.tradeAccountName = tradeAccountName == null ? null : tradeAccountName.trim();
    }

    public String getTradeAccountNo() {
        return tradeAccountNo;
    }

    public void setTradeAccountNo(String tradeAccountNo) {
        this.tradeAccountNo = tradeAccountNo == null ? null : tradeAccountNo.trim();
    }

    public String getCounterBank() {
        return counterBank;
    }

    public void setCounterBank(String counterBank) {
        this.counterBank = counterBank == null ? null : counterBank.trim();
    }

    public String getCounterAccountName() {
        return counterAccountName;
    }

    public void setCounterAccountName(String counterAccountName) {
        this.counterAccountName = counterAccountName == null ? null : counterAccountName.trim();
    }

    public String getCounterAccountNo() {
        return counterAccountNo;
    }

    public void setCounterAccountNo(String counterAccountNo) {
        this.counterAccountNo = counterAccountNo == null ? null : counterAccountNo.trim();
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel == null ? null : channel.trim();
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose == null ? null : purpose.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getPostscript() {
        return postscript;
    }

    public void setPostscript(String postscript) {
        this.postscript = postscript == null ? null : postscript.trim();
    }

    public String getTransactionInfo() {
        return transactionInfo;
    }

    public void setTransactionInfo(String transactionInfo) {
        this.transactionInfo = transactionInfo == null ? null : transactionInfo.trim();
    }

    public String getTransactionDesc() {
        return transactionDesc;
    }

    public void setTransactionDesc(String transactionDesc) {
        this.transactionDesc = transactionDesc == null ? null : transactionDesc.trim();
    }

    public String getTransactionExplain() {
        return transactionExplain;
    }

    public void setTransactionExplain(String transactionExplain) {
        this.transactionExplain = transactionExplain == null ? null : transactionExplain.trim();
    }

    public String getBusinessSummary() {
        return businessSummary;
    }

    public void setBusinessSummary(String businessSummary) {
        this.businessSummary = businessSummary == null ? null : businessSummary.trim();
    }
}