package com.simpleway.frst.base;

import java.util.List;


/**
 * 分页条件封装
 * @author zhaoyu
 *
 */
public class BaseWhere {
	private Integer pageNo = 1;
	private Integer pageSize = 10;
	private List<Sort> sorts;
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
    public List<Sort> getSorts() {
        return sorts;
    }
    public void setSorts(List<Sort> sorts) {
        this.sorts = sorts;
    }
	
}
