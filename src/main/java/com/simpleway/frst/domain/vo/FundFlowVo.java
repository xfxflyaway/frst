package com.simpleway.frst.domain.vo;

import java.math.BigDecimal;
import java.util.Date;

public class FundFlowVo {
	private Long id;
	private Long inflowAreaId;
	private String inflowAreaName;
	private Long outflowAreaId;
	private String outflowAreaName;
	private BigDecimal inflowAmount;
	private Date countDay;
	private String inOutFlag;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getInflowAreaId() {
		return inflowAreaId;
	}
	public void setInflowAreaId(Long inflowAreaId) {
		this.inflowAreaId = inflowAreaId;
	}
	public String getInflowAreaName() {
		return inflowAreaName;
	}
	public void setInflowAreaName(String inflowAreaName) {
		this.inflowAreaName = inflowAreaName;
	}
	public Long getOutflowAreaId() {
		return outflowAreaId;
	}
	public void setOutflowAreaId(Long outflowAreaId) {
		this.outflowAreaId = outflowAreaId;
	}
	public String getOutflowAreaName() {
		return outflowAreaName;
	}
	public void setOutflowAreaName(String outflowAreaName) {
		this.outflowAreaName = outflowAreaName;
	}
	public BigDecimal getInflowAmount() {
		return inflowAmount;
	}
	public void setInflowAmount(BigDecimal inflowAmount) {
		this.inflowAmount = inflowAmount;
	}
	public Date getCountDay() {
		return countDay;
	}
	public void setCountDay(Date countDay) {
		this.countDay = countDay;
	}
	public String getInOutFlag() {
		return inOutFlag;
	}
	public void setInOutFlag(String inOutFlag) {
		this.inOutFlag = inOutFlag;
	}
	
	
}
