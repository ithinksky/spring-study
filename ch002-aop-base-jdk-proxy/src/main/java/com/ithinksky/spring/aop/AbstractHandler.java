package com.ithinksky.spring.aop;


import java.lang.reflect.InvocationHandler;

/**
 * 处理器
 *
 * @author tengpeng.gao
 * @since 2019-02-22
 */
public abstract class AbstractHandler implements InvocationHandler {

    protected Object targetObject;

    public Object getTargetObject() {
        return targetObject;
    }

    public void setTargetObject(Object targetObject) {
        this.targetObject = targetObject;
    }
}
