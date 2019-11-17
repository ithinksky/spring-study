package com.ithinksky.spring.chapter08.mapper;

import org.springframework.stereotype.Repository;

/**
 * 功能描述：
 *
 * @author tengpeng.gao
 * @since 2019/3/22
 */
@Repository
public class UserMapper {

    private Integer index = 1;

    public void setIndex(Integer index) {
        this.index = index;
    }

    public UserMapper() {
    }

    public void addUser() {
        System.out.println(" UserMapper === index == " + index);
    }

}
