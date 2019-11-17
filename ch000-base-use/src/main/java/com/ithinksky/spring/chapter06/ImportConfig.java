package com.ithinksky.spring.chapter06;

import com.ithinksky.spring.chapter06.bean.Cat;
import com.ithinksky.spring.chapter06.bean.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Bean 导入方式加载
 *
 * @author tengpeng.gao
 * @since 2018/8/8
 */
@Configuration
// 通过 @Import 方式导入的bean的实例id 是类的全名
@Import(value = {Dog.class, Cat.class, CustomImportSelector.class, CustomImportBeanDefinitionRegister.class})
public class ImportConfig {

    @Bean
    public CustomFactoryBean customFactoryBean() {
        return new CustomFactoryBean();
    }

}
