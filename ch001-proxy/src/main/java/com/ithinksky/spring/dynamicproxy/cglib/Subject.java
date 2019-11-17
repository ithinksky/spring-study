package com.ithinksky.spring.dynamicproxy.cglib;

/**
 * 被代理类
 *
 * @author tengpeng.gao
 * @since 2019-02-21
 */
public class Subject {

    public void request() {
        System.out.println("update without implement any interface.");
    }

}
