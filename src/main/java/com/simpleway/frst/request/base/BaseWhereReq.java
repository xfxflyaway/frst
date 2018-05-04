package com.simpleway.frst.request.base;

import java.util.List;


public class BaseWhereReq {
	private Integer pageNo = 1;
	private Integer pageSize = 10;
//	private List<Sort> sorts;
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
//    public List<Sort> getSorts() {
//        return sorts;
//    }
//    public void setSorts(List<Sort> sorts) {
//        this.sorts = sorts;
//    }
}
