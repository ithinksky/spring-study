package com.ithinksky.spring.aop;

import java.lang.reflect.Method;

/**
 * 前置处理器定义
 *
 * @author tengpeng.gao
 * @since 2019-02-22
 */
public abstract class AbstractBeforeHandler extends AbstractHandler {

    public abstract void handleBefore(Object proxy, Method method, Object[] args);

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        handleBefore(proxy, method, args);
        Object result = method.invoke(targetObject, args);
        return result;
    }
}
