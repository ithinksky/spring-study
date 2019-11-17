package com.ithinksky.spring.chapter06;

import com.ithinksky.spring.chapter06.bean.Snake;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author tengpeng.gao
 * @since 2018/8/8
 */
public class CustomImportBeanDefinitionRegister implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(Snake.class);
        registry.registerBeanDefinition("snake", rootBeanDefinition);
    }
}
