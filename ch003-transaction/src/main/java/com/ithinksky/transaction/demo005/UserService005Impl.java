package com.ithinksky.transaction.demo005;

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
public class UserService005Impl {

    public static class AException extends Exception {

    }

    public static class BException extends Exception {

    }

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional(noRollbackFor = BException.class)
    public void addUserNoRollbackForBException(String userName) throws BException {
        jdbcTemplate.execute(" insert into t_user(uname) value ('" + userName + "')");
        throw new BException();
    }

    @Transactional(rollbackFor = AException.class)
    public void addUserRollbackForAException001(String userName) throws BException {
        jdbcTemplate.execute(" insert into t_user(uname) value ('" + userName + "')");
        throw new BException();
    }

    @Transactional(rollbackFor = AException.class)
    public void addUserRollbackForAException002(String userName) throws AException {
        jdbcTemplate.execute(" insert into t_user(uname) value ('" + userName + "')");
        throw new AException();
    }

    @Transactional(rollbackFor = AException.class)
    public void addUserRollbackForAException003(String userName) {
        jdbcTemplate.execute(" insert into t_user(uname) value ('" + userName + "')");
        try {
            throw new AException();
        } catch (AException e) {
            e.printStackTrace();
        }
    }

    @Transactional
    public void addUserCatchRuntimeException(String userName) {
        jdbcTemplate.execute(" insert into t_user(uname) value ('" + userName + "')");
        try {
            throw new RuntimeException(" RuntimeException 运行时异常，执行回滚");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
