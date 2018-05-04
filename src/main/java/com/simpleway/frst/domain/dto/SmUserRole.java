package com.simpleway.frst.domain.dto;

public class SmUserRole {
    private Long id;

    private Long loginId;

    private Long roleId;

    public SmUserRole(Long id, Long loginId, Long roleId) {
        this.id = id;
        this.loginId = loginId;
        this.roleId = roleId;
    }

    public SmUserRole() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getLoginId() {
        return loginId;
    }

    public void setLoginId(Long loginId) {
        this.loginId = loginId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
}