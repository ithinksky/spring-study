package com.ithinksky.spring.chapter05;

import com.ithinksky.spring.chapter01.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * Bean 条件注入
 *
 * @author tengpeng.gao
 * @since 2018/8/8
 */
@Configuration
public class ConditionalConfig {

    @Conditional(WinCondition.class)
    @Bean("tengpeng.gao")
    public Person tengpengGao() {
        System.out.println("给容器中添加person……");
        return new Person("tengpeng.gao", 18);
    }

    // 通过 VM 参数模拟操作系统 -Dos.name=linux
    @Conditional(LinuxCondition.class)
    @Bean("beautiful girl")
    public Person beautifulGirl() {
        System.out.println("给容器中添加person……");
        return new Person("beautiful girl", 22);
    }

}
