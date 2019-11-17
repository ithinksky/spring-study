package com.ithinksky.spring.chapter01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 注解式配置文件
 *
 * @author tengpeng.gao
 * @since 2018/8/7
 */
// 承载了 传统的配置文件 XML 相同的能力
// 配置类 ==== 配置文件
@Configuration
public class BeanConfig {

    // 1、默认方式：在方法上使用 @Bean 注解，则默认的 bean 实例id 为方法名称
    // 2、指定方式：指定 bean 实例id  @Bean("person")
    @Bean
    public Person personA() {
        return new Person("tengpeng.gao", 18);
    }


}
