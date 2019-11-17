package com.ithinksky.spring.chapter08.service.impl;

import com.ithinksky.spring.chapter08.mapper.UserMapper;
import com.ithinksky.spring.chapter08.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 功能描述：
 *
 * @author tengpeng.gao
 * @since 2019/3/22
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void getUser() {
        userMapper.addUser();
    }
}
