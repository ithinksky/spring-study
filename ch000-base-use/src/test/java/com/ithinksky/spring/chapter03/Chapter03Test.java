package com.ithinksky.spring.chapter03;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 第三节测试
 *
 * @author tengpeng.gao
 * @since 2018/8/7
 */
public class Chapter03Test {

    @Test
    public void testAnnotationDefaultBean() {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ScopeConfig
                .class);
        String[] names = applicationContext.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }

        Object bean1 = applicationContext.getBean("person");
        Object bean2 = applicationContext.getBean("person");
        System.out.println(bean1 == bean2); // 单实例获取的对象不相等

    }

    @Test
    public void testAnnotationPrototypeBean() {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ScopeConfig
                .class);
        String[] names = applicationContext.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }

        Object bean1 = applicationContext.getBean("personA");
        Object bean2 = applicationContext.getBean("personA");
        System.out.println(bean1 == bean2); // 多实例获取的对象不相等

    }

}