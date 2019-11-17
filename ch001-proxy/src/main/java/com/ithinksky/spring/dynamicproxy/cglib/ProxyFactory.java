package com.ithinksky.spring.dynamicproxy.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Cglib子类代理工厂
 * 对Subject在内存中动态构建一个子类对象
 *
 * @author tengpeng.gao
 * @since 2019-02-21
 */
public class ProxyFactory implements MethodInterceptor {

    private Subject subject;

    public ProxyFactory(Subject subject) {
        this.subject = subject;
    }

    public Object getProxyInstance() {
        //1.工具类
        Enhancer enhancer = new Enhancer();
        //2.设置父类
        enhancer.setSuperclass(subject.getClass());
        //3.设置回调函数
        enhancer.setCallback(this);
        //4.创建子类(代理对象)
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("before Subject.");
        Object result = methodProxy.invokeSuper(o, objects);
        System.out.println("after Subject.");
        return result;
    }


}
