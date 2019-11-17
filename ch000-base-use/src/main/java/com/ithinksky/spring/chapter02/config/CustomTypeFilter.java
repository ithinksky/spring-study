package com.ithinksky.spring.chapter02.config;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

/**
 * 自定义扫描类型拦截器
 *
 * @author tengpeng.gao
 * @since 2018/8/7
 */
public class CustomTypeFilter implements TypeFilter {


    // metadataReader : 读取到当前正在扫描的类的信息
    // metadataReaderFactory ： 可以获取到其他任何类信息的
    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws
            IOException {

        // 获取当前类的注解信息
        AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();

        // 获取当前正在扫描的类的类信息
        ClassMetadata classMetadata = metadataReader.getClassMetadata();

        // 获取当前类资源（类的路径）
        Resource resource = metadataReader.getResource();

        String className = classMetadata.getClassName();
        System.out.println("---> " + className);

        if (className.contains("Order")) {

            return true; // 当类名包含er，则匹配成功
        }
        return false;
    }
}
