package com.simpleway.frst.request.base;

public class Sort {

	private String field;// 列名

	private String order;// 排序方式 desc|asc

	public Sort() {
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public Sort(String field, String order) {
		super();
		this.field = field;
		this.order = order;
	}

}
