package com.simpleway.frst.domain.dto;

public class SmRoleAuth {
    private Long id;

    private Long roleId;

    private Long authId;

    private Integer authType;

    public SmRoleAuth(Long id, Long roleId, Long authId, Integer authType) {
        this.id = id;
        this.roleId = roleId;
        this.authId = authId;
        this.authType = authType;
    }

    public SmRoleAuth() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getAuthId() {
        return authId;
    }

    public void setAuthId(Long authId) {
        this.authId = authId;
    }

    public Integer getAuthType() {
        return authType;
    }

    public void setAuthType(Integer authType) {
        this.authType = authType;
    }
}