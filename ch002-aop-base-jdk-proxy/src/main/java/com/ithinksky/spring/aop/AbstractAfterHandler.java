package com.ithinksky.spring.aop;

import java.lang.reflect.Method;

/**
 * 后置处理器定义
 *
 * @author tengpeng.gao
 * @since 2019-02-22
 */
public abstract class AbstractAfterHandler extends AbstractHandler {

    public abstract void handleAfter(Object proxy, Method method, Object[] args);

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(targetObject, args);
        handleAfter(proxy, method, args);
        return result;
    }
}
