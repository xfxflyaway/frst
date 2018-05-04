package com.simpleway.frst.domain.vo;

import java.io.Serializable;
import java.util.List;

public class SmAuthVo implements Serializable {
	private static final long serialVersionUID = 1L;

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
	private Long createTime;
	private Long updateTime;
	private List<SmAuthVo> sunPerm;
	private boolean flag;
	private String icon;

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
		this.authInnerCode = authInnerCode;
	}

	public String getAuthOutCode() {
		return authOutCode;
	}

	public void setAuthOutCode(String authOutCode) {
		this.authOutCode = authOutCode;
	}

	public String getAuthName() {
		return authName;
	}

	public void setAuthName(String authName) {
		this.authName = authName;
	}

	public String getAuthUrl() {
		return authUrl;
	}

	public void setAuthUrl(String authUrl) {
		this.authUrl = authUrl;
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
		this.authDesc = authDesc;
	}

	public Long getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}

	public Long getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Long updateTime) {
		this.updateTime = updateTime;
	}

	public List<SmAuthVo> getSunPerm() {
		return sunPerm;
	}

	public void setSunPerm(List<SmAuthVo> sunPerm) {
		this.sunPerm = sunPerm;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

}