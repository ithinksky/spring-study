package com.ithinksky.transaction.demo004;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 测试服务层实现
 *
 * @author tengpeng.gao
 * @since 2019/2/27
 */
@Service
public class Service004Impl {

    @Autowired
    private UserService004Impl userService004Impl;

    public void addUser(String userName) {
        userService004Impl.addUser(userName);
    }

    public void addUserProtected(String userName) {
        userService004Impl.addUserProtected(userName);
    }

    public void addUserDefault(String userName) {
        userService004Impl.addUserDefault(userName);

    }
}
