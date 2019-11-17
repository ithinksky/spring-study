package com.ithinksky.spring.chapter04;

import com.ithinksky.spring.chapter01.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

/**
 * Bean 懒加载
 *
 * @author tengpeng.gao
 * @since 2018/8/7
 */
@Configuration
public class LazyConfig {

    // 单实例：IOC容器启动的时候，IOC容器会创建一个对象放到IOC容器中，以后每次获取的时候直接从IOC容器中取同一个Bean

    // 懒加载：主要针对单实例bean，默认在IOC容器启动时候加载
    // 懒加载：容器启动时候不创建对象，仅当第一次使用Bean实例的时候才创建被初始化
    @Lazy
    @Bean
    public Person person() {
        System.out.println("给容器中添加person……");
        return new Person("tengpeng.gao", 18);
    }

}
