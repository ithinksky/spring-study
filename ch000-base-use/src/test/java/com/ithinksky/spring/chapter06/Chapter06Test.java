package com.ithinksky.spring.chapter06;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 第六个测试类
 *
 * @author tengpeng.gao
 * @since 2018/8/8
 */
public class Chapter06Test {

    @Test
    public void testAnnotationDefaultBean() {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ImportConfig
                .class);
        String[] names = applicationContext.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }

        CustomFactoryBean customFactoryBean = applicationContext.getBean(CustomFactoryBean.class);
        System.out.println(customFactoryBean.getObject().getId());

    }


}