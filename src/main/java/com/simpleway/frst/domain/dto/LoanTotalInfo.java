package com.simpleway.frst.domain.dto;

import java.math.BigDecimal;

public class LoanTotalInfo {
	private Long id;
	private Long companyId;
	private String companyName;
	private BigDecimal totalAmount;
	private String countMonth;

	public LoanTotalInfo() {

	}
	
	public LoanTotalInfo(BigDecimal totalAmount,String countMonth) {
		this.totalAmount = totalAmount;
		this.countMonth = countMonth;
	}

	public LoanTotalInfo(Long id,Long companyId,String companyName,BigDecimal totalAmount,String countMonth) {
		this.id = id;
		this.companyId =companyId;
		this.companyName = companyName;
		this.totalAmount = totalAmount;
		this.countMonth = countMonth;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public BigDecimal getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getCountMonth() {
		return countMonth;
	}

	public void setCountMonth(String countMonth) {
		this.countMonth = countMonth;
	}

}
