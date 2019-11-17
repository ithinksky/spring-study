package com.ithinksky.spring.chapter07;

import com.ithinksky.spring.chapter07.bean.Bike;
import com.ithinksky.spring.chapter07.bean.Jeep;
import com.ithinksky.spring.chapter07.bean.Train;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Bean 的生命周期
 *
 * @author tengpeng.gao
 * @since 2018/8/9
 */
@ComponentScan(basePackages = {"com.ithinksky.spring.chapter07"})
@Configuration
public class BeanConfig {

    @Bean(initMethod = "init", destroyMethod = "destory")
    public Bike bike() {
        System.out.println("给容器中添加 bike ……");
        return new Bike();
    }

    @Bean
    public Train train() {
        System.out.println("给容器中添加 train ……");
        return new Train();
    }

    @Bean
    public Jeep jeep() {
        System.out.println("给容器中添加 jeep ……");
        return new Jeep();
    }


}
