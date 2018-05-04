package com.simpleway.frst.response;

public class JsonResult extends BaseResult {

	private Object data;

	public JsonResult() {
	}

	public JsonResult(Boolean flag, Object data) {
		this.flag = flag;
		this.code = flag ? 1 : 0;
		this.msg = flag ? "操作成功" : "服务异常";
		if (null != data) {
			this.data = data;
		}
	}

	public JsonResult(Boolean flag) {
		this.flag = flag;
		this.code = flag ? 1 : 0;
		this.msg = flag ? "操作成功" : "服务异常";
	}

	public JsonResult(Boolean flag, int code, Object... data) {
		this.flag = flag;
		this.code = code;
		this.msg = flag ? "操作成功" : "服务异常";
		if (null != data) {
			this.data = data;
		}
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
}
