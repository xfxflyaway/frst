package com.simpleway.frst.domain.dto;

import java.math.BigDecimal;
import java.util.Date;

public class FundFlow {
	private Long id;
	private Long inflowAreaId;
	private Long outflowAreaId;
	private BigDecimal inflowAmount;
	private Date countDay;
	private String inOutFlag;
	
	public FundFlow(Long id,Long inflowAreaId,Long outflowAreaId,BigDecimal inflowAmount, Date countDay,String inOutFlag){
		this.id= id;
		this.inflowAreaId = inflowAreaId;
		this.outflowAreaId = outflowAreaId;
		this.inflowAmount = inflowAmount;
		this.countDay = countDay;
		this.inOutFlag = inOutFlag;
	}
	public FundFlow(){
		
	}

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

	public Long getOutflowAreaId() {
		return outflowAreaId;
	}

	public void setOutflowAreaId(Long outflowAreaId) {
		this.outflowAreaId = outflowAreaId;
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
