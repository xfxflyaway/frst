package com.simpleway.frst.domain.dto;

import java.math.BigDecimal;
import java.util.Date;

public class WarnReport {
	public Long id;
	public Long warnCompanyId;
	public Integer warnType;
	public BigDecimal warnAmount;
	public Date countDay;


	public WarnReport() {
	}

	public WarnReport(Long id, Long warnCompanyId, Integer warnType, BigDecimal warnAmount, Date countDay) {
		this.id = id;
		this.warnCompanyId = warnCompanyId;
		this.warnType = warnType;
		this.warnAmount = warnAmount;
		this.countDay = countDay;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getWarnType() {
		return warnType;
	}

	public void setWarnType(Integer warnType) {
		this.warnType = warnType;
	}

	public BigDecimal getWarnAmount() {
		return warnAmount;
	}

	public void setWarnAmount(BigDecimal warnAmount) {
		this.warnAmount = warnAmount;
	}

	public Date getCountDay() {
		return countDay;
	}

	public void setCountDay(Date countDay) {
		this.countDay = countDay;
	}

	public Long getWarnCompanyId() {
		return warnCompanyId;
	}

	public void setWarnCompanyId(Long warnCompanyId) {
		this.warnCompanyId = warnCompanyId;
	}
}
