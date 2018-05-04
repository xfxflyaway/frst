/*
 * @(#) EventBusAdaptor.java ,2017年07月09日
 *
 * Copyright 2017 zbj.com, Inc. ALL rights reserved.
 * ZHUBAJIE PROPRIETARY/CONFIDENTIAL. Use is subject to lincese trems.
 */
package com.simpleway.frst.eventbus;

import com.google.common.eventbus.AsyncEventBus;
import com.google.common.eventbus.EventBus;
import org.springframework.stereotype.Component;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 事件总线适配器
 */
@Component
public class EventBusAdaptor {


    private ExecutorService executorService;

    /**
     * 事件总线
     */
    private EventBus eventBus;

    public EventBusAdaptor() {
        executorService = Executors.newFixedThreadPool(1);
        eventBus = new AsyncEventBus(executorService);
    }

    /**
     * 发布事件
     *
     * @param o
     */
    public void publish(Object o) {
        eventBus.post(o);
    }

    /**
     * 注册监听器
     *
     * @param o
     */
    public void register(Object o) {
        eventBus.register(o);
    }

    /**
     * 取消注册监听器
     *
     * @param o
     */
    public void unregister(Object o) {
        eventBus.unregister(o);
    }

}
