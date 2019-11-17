package com.ithinksky.spring.aop;

import java.lang.reflect.Method;

/**
 * 环绕处理器定义
 *
 * @author tengpeng.gao
 * @since 2019-02-22
 */
public abstract class AbstractAroundHandler extends AbstractHandler {

    public abstract void handleAround(Object proxy, Method method, Object[] args);

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        handleAround(proxy, method, args);
        Object result = method.invoke(targetObject, args);
        handleAround(proxy, method, args);
        return result;
    }
}
