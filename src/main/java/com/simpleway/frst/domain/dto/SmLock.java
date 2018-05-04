package com.simpleway.frst.domain.dto;

import java.util.Date;

public class SmLock {
    private String lockId;

    private Date lastTime;

    public SmLock(String lockId, Date lastTime) {
        this.lockId = lockId;
        this.lastTime = lastTime;
    }

    public SmLock() {
        super();
    }

    public String getLockId() {
        return lockId;
    }

    public void setLockId(String lockId) {
        this.lockId = lockId == null ? null : lockId.trim();
    }

    public Date getLastTime() {
        return lastTime;
    }

    public void setLastTime(Date lastTime) {
        this.lastTime = lastTime;
    }
}