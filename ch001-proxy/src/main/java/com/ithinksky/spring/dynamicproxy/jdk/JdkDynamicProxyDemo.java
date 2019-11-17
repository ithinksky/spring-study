package com.ithinksky.spring.dynamicproxy.jdk;

/**
 * Jdk模式 动态代理
 *
 * 一、主题接口
 * 二、真实主题
 * 三、实现 InvocationHandler 接口的代理处理类
 * 四、使用 jdk 提供的类 Proxy 进行动态生成代理类
 *
 * 1、java.lang.reflect.InvocationHandler 接口
 * 2、java.lang.reflect.Proxy 类静态方法：newProxyInstance
 *     public static Object newProxyInstance(ClassLoader loader,
 *                                           Class<?>[] interfaces,
 *                                           InvocationHandler h)
 *
 * @author tengpeng.gao
 * @since 2019-02-21
 */
public class JdkDynamicProxyDemo {

    public static void main(String[] args) {

        // 查看动态代理生成的类配置
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");

        Subject realSubject = new SubjectImpl();
        Subject proxySubject = (Subject) new ProxyFactory(realSubject).getProxyInstance();

        proxySubject.sayHi();
        proxySubject.sayHello();

    }

}
