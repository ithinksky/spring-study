package com.ithinksky.spring.chapter04;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 第四节测试
 *
 * @author tengpeng.gao
 * @since 2018/8/7
 */
public class Chapter04Test {

    @Test
    public void testAnnotationDefaultBean() throws InterruptedException {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(LazyConfig
                .class);
        System.out.println("容器初始化完成");
        String[] names = applicationContext.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }

        Thread.sleep(20000);

        applicationContext.getBean("person");

    }

}