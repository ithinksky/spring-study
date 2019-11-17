package com.ithinksky.spring.chapter07.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author tengpeng.gao
 * @since 2018/8/9
 */
public class Train implements InitializingBean, DisposableBean {

    public Train() {
        System.out.println("Train 构造方法……");
    }

    @Override
    public void afterPropertiesSet() {
        System.out.println("Train afterPropertiesSet……");
    }

    @Override
    public void destroy() {
        System.out.println("Train destroy……");
    }
}
