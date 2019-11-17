package com.ithinksky.spring.chapter06;

import com.ithinksky.spring.chapter06.bean.Monkey;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author tengpeng.gao
 * @since 2018/8/8
 */
public class CustomFactoryBean implements FactoryBean<Monkey> {
    @Override
    public Monkey getObject() {
        return new Monkey();
    }

    @Override
    public Class<?> getObjectType() {
        return Monkey.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
