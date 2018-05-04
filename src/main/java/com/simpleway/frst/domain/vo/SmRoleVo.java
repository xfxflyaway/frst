package com.simpleway.frst.domain.vo;

import java.util.List;

public class SmRoleVo {

	private Long roleId;
	private String roleName;
	private String roleDesc;
	private String roleCode;
	private Integer roleType;
	private Integer status;
	private Long createTime;
	private Long updateTime;
	private List<Long> smAuths;
	private List<String> smAuthNames;

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleDesc() {
		return roleDesc;
	}

	public void setRoleDesc(String roleDesc) {
		this.roleDesc = roleDesc;
	}

	public String getRoleCode() {
		return roleCode;
	}

	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}

	public Integer getRoleType() {
		return roleType;
	}

	public void setRoleType(Integer roleType) {
		this.roleType = roleType;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
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

	public List<Long> getSmAuths() {
		return smAuths;
	}

	public void setSmAuths(List<Long> smAuths) {
		this.smAuths = smAuths;
	}

	public List<String> getSmAuthNames() {
		return smAuthNames;
	}

	public void setSmAuthNames(List<String> smAuthNames) {
		this.smAuthNames = smAuthNames;
	}

}