package com.ithinksky.spring.dynamicproxy.cglib;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 使用回调方式创建子类实现代理
 *
 * @author tengpeng.gao
 * @since 2019-02-21
 */
public class SubSubjectCallback implements MethodInterceptor {

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("before Subject.");
        Object result = methodProxy.invokeSuper(o, objects);
        System.out.println("after Subject.");
        return result;
    }

}
