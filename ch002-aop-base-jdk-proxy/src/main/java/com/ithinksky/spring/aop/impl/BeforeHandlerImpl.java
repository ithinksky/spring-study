package com.ithinksky.spring.aop.impl;

import com.ithinksky.spring.aop.AbstractBeforeHandler;

import java.lang.reflect.Method;

/**
 * 前置处理器实现
 *
 * @author tengpeng.gao
 * @since 2019-02-22
 */
public class BeforeHandlerImpl extends AbstractBeforeHandler {
    @Override
    public void handleBefore(Object proxy, Method method, Object[] args) {
        System.out.println("Handling before actual method execution ........");
    }
}
