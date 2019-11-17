package com.ithinksky.spring.dynamicproxy.cglib;

import org.springframework.cglib.proxy.Enhancer;

/**
 * cglib模式 动态代理
 *
 * 1、org.springframework.cglib.proxy.MethodInterceptor 接口
 * 2、org.springframework.cglib.proxy.Enhancer 类
 *          setSuperclass
 *          setCallback
 *          create
 *
 * @author tengpeng.gao
 * @since 2019-02-21
 */
public class CglibDynamicProxyDemo {

    public static void main(String[] args) {
        Subject proxySubject = (Subject) new ProxyFactory(new Subject()).getProxyInstance();
        proxySubject.request();
    }

}
