package com.simpleway.frst.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DataSourceConfig {

    @Value("${datasource.url}")
    private String url;

    @Value("${datasource.username}")
    private String username;

    @Value("${datasource.password}")
    private String password;

    private int minIdleConnSize = 1;

    private int initConnSize = 1;

    private int maxActiveConnSize = 50;

    private String driver = "com.mysql.jdbc.Driver";

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getMinIdleConnSize() {
        return minIdleConnSize;
    }

    public void setMinIdleConnSize(int minIdleConnSize) {
        this.minIdleConnSize = minIdleConnSize;
    }

    public int getInitConnSize() {
        return initConnSize;
    }

    public void setInitConnSize(int initConnSize) {
        this.initConnSize = initConnSize;
    }

    public int getMaxActiveConnSize() {
        return maxActiveConnSize;
    }

    public void setMaxActiveConnSize(int maxActiveConnSize) {
        this.maxActiveConnSize = maxActiveConnSize;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }
}
