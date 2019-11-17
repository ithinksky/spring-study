package com.ithinksky.spring.chapter07.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * 自定义后置处理器
 *
 * 构造函数 > postProcessBeforeInitialization > init > postProcessAfterInitialization
 *
 * @author tengpeng.gao
 * @since 2018/8/9
 */
@Component
public class CustomBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization - " + beanName + "--->" + bean);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization - " + beanName + "--->" + bean);
        return bean;
    }
}
