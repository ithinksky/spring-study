package com.ithinksky.spring.chapter05;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 第五个测试
 *
 * @author tengpeng.gao
 * @since 2018/8/8
 */
public class Chapter05Test {

    @Test
    public void testAnnotationDefaultBean() {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext
                (ConditionalConfig.class);
        String[] names = applicationContext.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }

}