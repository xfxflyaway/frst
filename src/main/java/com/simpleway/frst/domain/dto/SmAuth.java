package com.simpleway.frst.domain.dto;

import java.util.Date;

public class SmAuth {
	private Long authId;

	private String authInnerCode;

	private String authOutCode;

	private String authName;

	private String authUrl;

	private Integer state;

	private Long upperAuthId;

	private Integer authType;

	private Integer sort;

	private String authDesc;

	private Date createTime;

	private Date updateTime;

	private String icon;

	// private String tpl;
	//
	// private String target;

	public SmAuth(Long authId, String authInnerCode, String authOutCode, String authName, String authUrl, Integer state,
			Long upperAuthId, Integer authType, Integer sort, String authDesc, Date createTime, Date updateTime,
			String icon) {
		this.authId = authId;
		this.authInnerCode = authInnerCode;
		this.authOutCode = authOutCode;
		this.authName = authName;
		this.authUrl = authUrl;
		this.state = state;
		this.upperAuthId = upperAuthId;
		this.authType = authType;
		this.sort = sort;
		this.authDesc = authDesc;
		this.createTime = createTime;
		this.updateTime = updateTime;
		this.icon = icon;
	}

	public SmAuth() {
		super();
	}

	public Long getAuthId() {
		return authId;
	}

	public void setAuthId(Long authId) {
		this.authId = authId;
	}

	public String getAuthInnerCode() {
		return authInnerCode;
	}

	public void setAuthInnerCode(String authInnerCode) {
		this.authInnerCode = authInnerCode == null ? null : authInnerCode.trim();
	}

	public String getAuthOutCode() {
		return authOutCode;
	}

	public void setAuthOutCode(String authOutCode) {
		this.authOutCode = authOutCode == null ? null : authOutCode.trim();
	}

	public String getAuthName() {
		return authName;
	}

	public void setAuthName(String authName) {
		this.authName = authName == null ? null : authName.trim();
	}

	public String getAuthUrl() {
		return authUrl;
	}

	public void setAuthUrl(String authUrl) {
		this.authUrl = authUrl == null ? null : authUrl.trim();
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Long getUpperAuthId() {
		return upperAuthId;
	}

	public void setUpperAuthId(Long upperAuthId) {
		this.upperAuthId = upperAuthId;
	}

	public Integer getAuthType() {
		return authType;
	}

	public void setAuthType(Integer authType) {
		this.authType = authType;
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	public String getAuthDesc() {
		return authDesc;
	}

	public void setAuthDesc(String authDesc) {
		this.authDesc = authDesc == null ? null : authDesc.trim();
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

}