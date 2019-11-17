package com.ithinksky.spring.chapter02;

import com.ithinksky.spring.chapter02.config.ComponentScanConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * 第二节测试
 *
 * @author tengpeng.gao
 * @since 2018/8/7
 */
public class Chapter02Test {

    @Test
    public void testAnnotationBean() {

        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(ComponentScanConfig.class);

        String[] names = applicationContext.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }

    }

}