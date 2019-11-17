package com.ithinksky.spring.chapter07;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 第七个测试类
 *
 * @author tengpeng.gao
 * @since 2018/8/9
 */
public class Chapter07Test {

    @Test
    public void testAnnotationDefaultBean() {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfig
                .class);
        System.out.println("容器初始化完成");

        applicationContext.close();

    }

}