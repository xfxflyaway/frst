/**
 * Copyright (c) @2015,重庆云途交通科技有限公司.版权所有
 */
package com.simpleway.frst.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.poi.util.SystemOutLogger;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;
import java.io.IOException;


@Configuration
@MapperScan("com.simpleway.frst.mapper")
public class MybatisConfig {

    // 注入配置
    @Autowired
    private DataSourceConfig dataSourceConfig;

    @Bean
    public DataSource dataSource() {
        DruidDataSource ds = new DruidDataSource();
        ds.setUrl(dataSourceConfig.getUrl());
        ds.setUsername(dataSourceConfig.getUsername());
        ds.setPassword(dataSourceConfig.getPassword());
        ds.setInitialSize(dataSourceConfig.getInitConnSize());
        ds.setMinIdle(dataSourceConfig.getMinIdleConnSize());
        ds.setMaxActive(dataSourceConfig.getMaxActiveConnSize());
        ds.setTimeBetweenEvictionRunsMillis(60000);
        ds.setDriverClassName(dataSourceConfig.getDriver());
        ds.setMaxWait(60000);
        ds.setMinEvictableIdleTimeMillis(300000);
        ds.setTestOnBorrow(false);
        ds.setTestOnReturn(false);
        ds.setTestWhileIdle(true);
        ds.setValidationQuery("SELECT 'x'");
        ds.setPoolPreparedStatements(false);
        return ds;
    }

    // spring 事务
    @Bean(name = "transactionManager")
    public DataSourceTransactionManager dataSourceTransactionManager() {
        DataSourceTransactionManager txManager = new DataSourceTransactionManager();
        txManager.setDataSource(dataSource());
        return txManager;
    }

    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean() throws IOException {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource());
        sqlSessionFactoryBean
                .setConfigLocation(new ClassPathResource("/config/mybatis/mybatis-config.xml"));
        Resource[] mapperResources = new PathMatchingResourcePatternResolver()
                .getResources("classpath*:config/mybatis/mapper/*.xml");
        sqlSessionFactoryBean.setMapperLocations(mapperResources);
        return sqlSessionFactoryBean;
    }


}
