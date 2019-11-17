package com.ithinksky.spring.staticproxy;

/**
 * 真实主题
 *
 * @author tengpeng.gao
 * @since 2019-02-20
 */
public class SubjectImpl implements Subject {
    @Override
    public void operation() {
        System.out.println("do operation...");
    }
}
