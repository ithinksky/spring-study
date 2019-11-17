package com.ithinksky.transaction.demo002;

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
@Transactional
public class UserService002Impl {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void addUser(String userName) {

        jdbcTemplate.execute(" insert into t_user(uname) value ('" + userName + "')");
        throw new RuntimeException(" RuntimeException 运行时异常，执行回滚");

    }

    public void deleteUser(String userName) {

        jdbcTemplate.execute(" delete from t_user where uname = ('" + userName + "')");
        throw new RuntimeException(" RuntimeException 运行时异常，执行回滚");

    }


}
