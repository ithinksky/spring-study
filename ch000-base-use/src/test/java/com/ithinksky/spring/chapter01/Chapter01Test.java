package com.ithinksky.spring.chapter01;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 第一节测试
 *
 * @author tengpeng.gao
 * @since 2018/8/7
 */
public class Chapter01Test {

    @Test
    public void testXmlBean() {

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person);

    }

    @Test
    public void testAnnotationBean() {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfig
                .class);
        Person person = (Person) applicationContext.getBean("personA");
        System.out.println(person);

    }


}