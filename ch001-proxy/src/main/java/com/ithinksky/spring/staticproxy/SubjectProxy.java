package com.ithinksky.spring.staticproxy;

/**
 * 代理类
 *
 * @author tengpeng.gao
 * @since 2019-02-20
 */
public class SubjectProxy implements Subject {

    private Subject realObject;

    public SubjectProxy(Subject realObject) {
        this.realObject = realObject;
    }

    @Override
    public void operation() {
        System.out.println("do something before real peration...");
        if (realObject == null) {
            realObject = new SubjectImpl();
        }
        realObject.operation();
        System.out.println("do something after real operation...");
    }
}
