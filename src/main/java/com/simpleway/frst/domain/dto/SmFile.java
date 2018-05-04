package com.simpleway.frst.domain.dto;

import java.util.Date;

public class SmFile {
    private Long fileId;

    private String fileName;

    private Integer fileType;

    private String filePath;

    private Date createTime;

    private String wxFilePath;

    private String fileSign;

    public SmFile(Long fileId, String fileName, Integer fileType, String filePath, Date createTime, String wxFilePath, String fileSign) {
        this.fileId = fileId;
        this.fileName = fileName;
        this.fileType = fileType;
        this.filePath = filePath;
        this.createTime = createTime;
        this.wxFilePath = wxFilePath;
        this.fileSign = fileSign;
    }

    public SmFile() {
        super();
    }

    public Long getFileId() {
        return fileId;
    }

    public void setFileId(Long fileId) {
        this.fileId = fileId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    public Integer getFileType() {
        return fileType;
    }

    public void setFileType(Integer fileType) {
        this.fileType = fileType;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath == null ? null : filePath.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getWxFilePath() {
        return wxFilePath;
    }

    public void setWxFilePath(String wxFilePath) {
        this.wxFilePath = wxFilePath == null ? null : wxFilePath.trim();
    }

    public String getFileSign() {
        return fileSign;
    }

    public void setFileSign(String fileSign) {
        this.fileSign = fileSign == null ? null : fileSign.trim();
    }
}