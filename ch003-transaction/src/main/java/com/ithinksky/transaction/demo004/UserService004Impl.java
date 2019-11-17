package com.ithinksky.transaction.demo004;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 用户业务操作实现类
 *
 * @author tengpeng.gao
 * @since 2019/2/27
 */
@Service
public class UserService004Impl {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional
    public void addUser(String userName) {
        jdbcTemplate.execute(" insert into t_user(uname) value ('" + userName + "')");
        throw new RuntimeException(" RuntimeException 运行时异常，执行回滚");
    }


    public void addUserHandle(String userName) {
        // 1. 只有来自外部的方法调用，事务才生效
        this.addUser(userName);
    }

    @Transactional
    protected void addUserProtected(String userName) {
        // 注解应该只被应用到 public 方法上。其它级别（ default、protected ，private 无效）
        jdbcTemplate.execute(" insert into t_user(uname) value ('" + userName + "')");
        throw new RuntimeException(" RuntimeException 运行时异常，执行回滚");
    }

    @Transactional
    void addUserDefault(String userName) {
        // 注解应该只被应用到 public 方法上。其它级别（default、protected ，private 无效）
        jdbcTemplate.execute(" insert into t_user(uname) value ('" + userName + "')");
        throw new RuntimeException(" RuntimeException 运行时异常，执行回滚");
    }

//    @Transactional
//    private void addUserPrivate(String userName) {
//        // 直接不让定义
//        jdbcTemplate.execute(" insert into t_user(uname) value ('" + userName + "')");
//        throw new RuntimeException(" RuntimeException 运行时异常，执行回滚");
//    }


}
