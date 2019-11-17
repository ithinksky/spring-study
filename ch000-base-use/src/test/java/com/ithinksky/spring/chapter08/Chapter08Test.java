package com.ithinksky.spring.chapter08;

import com.ithinksky.spring.chapter08.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 功能描述：
 *
 * @author tengpeng.gao
 * @since 2019/3/22
 */
@RunWith(SpringJUnit4ClassRunner.class)  //使用junit4进行测试
@ContextConfiguration(classes = BeanConfig.class) // 指定配置文件
public class Chapter08Test {

    @Autowired
    IUserService userService;

    @Test
    public void addAutoWired() {
        userService.getUser();
    }


}