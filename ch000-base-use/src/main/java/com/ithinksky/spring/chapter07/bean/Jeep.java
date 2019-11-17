package com.ithinksky.spring.chapter07.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author tengpeng.gao
 * @since 2018/8/9
 */
public class Jeep {

    public Jeep() {
        System.out.println("Jeep 构造方法……");
    }

    @PostConstruct
    public void init() {
        System.out.println("Jeep init……");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Jeep destroy……");
    }


}
