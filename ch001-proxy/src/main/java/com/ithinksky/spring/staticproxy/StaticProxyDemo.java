package com.ithinksky.spring.staticproxy;

/**
 * 静态代理
 *
 * @author tengpeng.gao
 * @since 2019-02-21
 */
public class StaticProxyDemo {

    public static void main(String[] args) {
        Subject proxy = new SubjectProxy(new SubjectImpl());
        proxy.operation();
    }

}
