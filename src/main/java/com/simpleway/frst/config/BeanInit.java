package com.simpleway.frst.config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * @author xiongfeixiang
 * @title BeanInit
 * @date 2017/9/27
 * @since v1.0.0
 */
@Component
public class BeanInit {

    private static final Integer THREAD_POOL_SIZE = 5;
    @Bean(destroyMethod="shutdown")
    public Executor taskExecutor() {
        return Executors.newScheduledThreadPool(THREAD_POOL_SIZE);
    }


}
