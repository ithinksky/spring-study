package com.ithinksky.spring.aop.impl;

import com.ithinksky.spring.aop.AbstractAroundHandler;

import java.lang.reflect.Method;

/**
 * 环绕处理器实现
 *
 * @author tengpeng.gao
 * @since 2019-02-22
 */
public class AroundHandlerImpl extends AbstractAroundHandler {

    @Override
    public void handleAround(Object proxy, Method method, Object[] args) {
        System.out.println("Handling around actual method execution ........");
    }

}
