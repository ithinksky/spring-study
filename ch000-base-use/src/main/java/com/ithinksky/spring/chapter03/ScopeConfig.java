package com.ithinksky.spring.chapter03;

import com.ithinksky.spring.chapter01.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Bean 类型
 *
 * @author tengpeng.gao
 * @since 2018/8/7
 */
@Configuration
public class ScopeConfig {

    // 单实例：IOC容器启动的时候，IOC容器会创建一个对象放到IOC容器中，以后每次获取的时候直接从IOC容器中取同一个Bean
    @Bean
    public Person person() {
        return new Person("tengpeng.gao", 18);
    }


    // 多实例： IOC容器启动的时候，IOC容器并不会创建对象，而是在每次获取的时候才会调用方法创建对象
    @Scope("prototype")
    @Bean
    public Person personA() {
        return new Person("tengpeng.gao", 18);
    }

}
