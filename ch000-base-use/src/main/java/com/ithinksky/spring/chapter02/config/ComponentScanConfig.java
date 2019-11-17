package com.ithinksky.spring.chapter02.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * 注解式配置文件
 *
 * @author tengpeng.gao
 * @since 2018/8/7
 */
@Configuration
@ComponentScan(value = "com.ithinksky.spring.chapter02", includeFilters = {
        @Filter(type = FilterType.CUSTOM, classes = {CustomTypeFilter.class})
},
        excludeFilters = {
        @Filter(type = FilterType.ANNOTATION, classes = {Controller.class})
},
        useDefaultFilters = false)
public class ComponentScanConfig {


}
