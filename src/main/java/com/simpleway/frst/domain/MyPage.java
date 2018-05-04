package com.simpleway.frst.domain;

public class MyPage {
	private Integer pageNo = 1;
	private Integer pageSize = 10;

	public Integer getPageNo() {
		return pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getStartNo() {
		return (pageNo - 1) * pageSize;
	}

}
