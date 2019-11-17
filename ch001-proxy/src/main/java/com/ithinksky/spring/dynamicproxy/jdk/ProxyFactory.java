package com.ithinksky.spring.dynamicproxy.jdk;

import java.lang.reflect.Proxy;

/**
 * 创建动态代理对象
 * 动态代理不需要实现接口,但是需要指定接口类型
 *
 * @author tengpeng.gao
 * @since 2019-02-21
 */
public class ProxyFactory {

    /**
     * 维护一个目标对象
     */
    private Subject realSubject;

    public ProxyFactory(Subject realSubject) {
        this.realSubject = realSubject;
    }

    /**
     * 给目标对象生成代理对象
     * @return
     */
    public Object getProxyInstance() {
        return Proxy.newProxyInstance(
                realSubject.getClass().getClassLoader(),
                realSubject.getClass().getInterfaces(),
                (proxy, method, args) -> {
                    System.out.print("say: ");
                    Object result = method.invoke(realSubject, args);
                    return result;
        });
    }

}
