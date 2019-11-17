package com.ithinksky.spring.aop;

import java.lang.reflect.Proxy;
import java.util.List;

/**
 * 代理工厂类
 *
 * @author tengpeng.gao
 * @since 2019-02-22
 */
public class ProxyFactory {


    public static Object getProxy(Object targetObject, List<AbstractHandler> handlers) {

        Object proxyObject;
        int size = handlers.size();
        if (size > 0) {
            proxyObject = targetObject;
            for (AbstractHandler handler : handlers) {
                proxyObject = ProxyFactory.getProxy(proxyObject, handler);
            }
            return proxyObject;
        } else {
            return targetObject;
        }

    }

    public static Object getProxy(Object targetObject, AbstractHandler handler) {
        handler.setTargetObject(targetObject);
        Object proxyObject = Proxy.newProxyInstance(targetObject.getClass().getClassLoader(),
                targetObject.getClass().getInterfaces(), handler);
        return proxyObject;
    }

}
