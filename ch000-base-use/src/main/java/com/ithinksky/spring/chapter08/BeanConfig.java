package com.ithinksky.spring.chapter08;

import com.ithinksky.spring.chapter08.mapper.UserMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 功能描述：使用 @Component 注解声明 bean 和
 *      在配置文件中使用 @Bean 注解配置的 bean
 *      在无特殊指定的情况下，生效的是 @Bean 配置的 bean
 *
 * @author tengpeng.gao
 * @since 2019/3/22
 */
@Configuration
@ComponentScan("com.ithinksky.spring.chapter08") // 指定 bean 扫描路径
public class BeanConfig {


    /**
     * 信息: Overriding bean definition for bean 'userMapper' with a different definition:
     * replacing [Generic bean: class [com.ithinksky.spring.chapter08.mapper.UserMapper];
     * scope=singleton; abstract=false; lazyInit=false; autowireMode=0; dependencyCheck=0;
     * autowireCandidate=true; primary=false; factoryBeanName=null; factoryMethodName=null;
     * initMethodName=null; destroyMethodName=null; defined in file
     * [E:\private\github\spring-study\ch000-base-use\target\classes\com\ithinksky\spring\chapter08\mapper\UserMapper.class]]
     * with [Root bean: class [null]; scope=; abstract=false; lazyInit=false; autowireMode=3;
     * dependencyCheck=0; autowireCandidate=true; primary=false; factoryBeanName=beanConfig;
     * factoryMethodName=userMapper; initMethodName=null; destroyMethodName=(inferred);
     * defined in com.ithinksky.spring.chapter08.BeanConfig]
     */
    @Bean
    public UserMapper userMapper() {
        UserMapper userMapper = new UserMapper();
        userMapper.setIndex(2);
        return userMapper;
    }


}
