package com.ithinksky.transaction;

import com.ithinksky.transaction.demo001.IUserService001;
import com.ithinksky.transaction.demo002.UserService002Impl;
import com.ithinksky.transaction.demo003.UserService003Impl;
import com.ithinksky.transaction.demo004.Service004Impl;
import com.ithinksky.transaction.demo004.UserService004Impl;
import com.ithinksky.transaction.demo005.UserService005Impl;
import com.ithinksky.transaction.demo005.UserService005Impl.AException;
import com.ithinksky.transaction.demo005.UserService005Impl.BException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Ch003TransactionApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class Ch003TransactionApplicationTests {

    @Autowired
    private IUserService001 userService001Impl;

    @Autowired
    private UserService002Impl userService002Impl;

    @Autowired
    private UserService003Impl userService003Impl;

    @Autowired
    private UserService004Impl userService004Impl;

    @Autowired
    private Service004Impl service004Impl;

    @Autowired
    private UserService005Impl userService005Impl;

    @Test
    public void testDemo001() {
        userService001Impl.addUser("张三");
    }

    @Test
    public void testDemo002addUser() {
        userService002Impl.addUser("张三");
    }

    @Test
    public void testDemo002deleteUser() {
        userService002Impl.deleteUser("张三");
    }

    @Test
    public void testDemo003() {
        userService003Impl.addUser("张三");
    }

    @Test
    public void testDemo004addUserHandle() {
        userService004Impl.addUserHandle("李四");
    }

    @Test
    public void testDemo004addUserProtected() {
        service004Impl.addUserProtected("王五");
    }

    @Test
    public void testDemo004addUserDefault() {
        service004Impl.addUserDefault("孙六");
    }

    @Test
    public void testDemo004addUser() {
        service004Impl.addUser("杨七");
    }

    @Test
    public void testDemo005addUserNoRollbackForBException() throws BException {
        userService005Impl.addUserNoRollbackForBException("张三");
    }

    @Test
    public void testDemo005addUserRollbackForAException001() throws BException {
        userService005Impl.addUserRollbackForAException001("张三");
    }

    @Test
    public void testDemo005addUserRollbackForAException002() throws AException {
        userService005Impl.addUserRollbackForAException002("张三");
    }

    @Test
    public void testDemo005addUserRollbackForAException003() {
        userService005Impl.addUserRollbackForAException003("张三");
    }

    @Test
    public void testDemo005addUserCatchRuntimeException() {
        userService005Impl.addUserCatchRuntimeException("张三");
    }

}
