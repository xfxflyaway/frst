package com.simpleway.frst.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;

import javax.annotation.Resource;
import java.util.concurrent.Executor;

/**
 * @author xiongfeixiang
 * @title ScheduleConfig
 * @date 2017/9/29 11:20
 * @since v1.0.0
 */
@Configuration
@EnableScheduling
public class ScheduleConfig implements SchedulingConfigurer {

    @Resource
    private Executor executor;

    /**
     * 调度并发
     *
     * @param scheduledTaskRegistrar
     */
    @Override
    public void configureTasks(ScheduledTaskRegistrar scheduledTaskRegistrar) {
        scheduledTaskRegistrar.setScheduler(executor);
    }
}
