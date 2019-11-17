package com.ithinksky.transaction.demo003;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * 用户业务操作实现类子类
 *
 * @author tengpeng.gao
 * @since 2019/2/27
 */
@Service
public class UserService003Impl extends UserService003ParentImpl {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addUser(String userName) {
        jdbcTemplate.execute(" insert into t_user(uname) value ('" + userName + "')");
        throw new RuntimeException(" RuntimeException 运行时异常，执行回滚");
    }

}
