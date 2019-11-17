package com.ithinksky.spring.aop.impl;

import com.ithinksky.spring.aop.AbstractAfterHandler;

import java.lang.reflect.Method;

/**
 * 后置处理器实现
 *
 * @author tengpeng.gao
 * @since 2019-02-22
 */
public class AfterHandlerImpl extends AbstractAfterHandler {
    @Override
    public void handleAfter(Object proxy, Method method, Object[] args) {
        System.out.println("Handling after actual method execution ........");
    }
}
