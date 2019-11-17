package com.ithinksky.transaction.demo001;

import org.springframework.transaction.annotation.Transactional;

/**
 * 用户业务操作实现接口
 *
 * @author tengpeng.gao
 * @since 2019/2/27
 */
@Transactional
public interface IUserService001 {

    void addUser(String userName);

}
