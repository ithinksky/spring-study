package com.ithinksky.spring.chapter06;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author tengpeng.gao
 * @since 2018/8/8
 */
public class CustomImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{"com.ithinksky.spring.chapter06.bean.Pig"};
    }
}
