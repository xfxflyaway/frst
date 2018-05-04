package com.simpleway.frst.exception;

import com.yuntu.exception.Errorcode;

public class YtfmUserErrors {
	public static final Errorcode PARAMETER_VALUE_EMPTY = new Errorcode(Errorcode.BUSINESS_ERROR, 99, 10011, "参数值为空");
	public static final Errorcode USER_DISABLE = new Errorcode(Errorcode.BUSINESS_ERROR, 99, 10012, "账户已停用");
	public static final Errorcode USER_EMPTY = new Errorcode(Errorcode.BUSINESS_ERROR, 99, 10013, "获取当前用户失败");
	public static final Errorcode ASSIGNED_ORG_EMPTY = new Errorcode(Errorcode.BUSINESS_ERROR, 99, 10014, "未分配组织机构权限");
	public static final Errorcode USER_EXIST = new Errorcode(Errorcode.BUSINESS_ERROR, 99, 10017, "用户已经存在");
	public static final Errorcode MAPPER_VALUE = new Errorcode(Errorcode.BUSINESS_ERROR, 99, 10018, "转换错误");
	public static final Errorcode COPY_PROPRER = new Errorcode(Errorcode.BUSINESS_ERROR, 99, 10019, "复制属性错误");
	public static final Errorcode FORCE_LOGINOUT = new Errorcode(Errorcode.BUSINESS_ERROR, 99, 10019, "强制退出错误");
	public static final Errorcode USER_LOCK = new Errorcode(Errorcode.BUSINESS_ERROR, 99, 10019, "账户已锁定");
}
