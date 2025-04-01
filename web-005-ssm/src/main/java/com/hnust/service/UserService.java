package com.hnust.service;

import com.hnust.bean.User;
import org.springframework.stereotype.Service;

/**
 * @author 袁权
 * @version
 */
public interface UserService {

    /**
     * 登录
     * @param user
     * @return
     */
    User login(User user);

    /**
     * 注册
     * @param user
     * @return
     */
    int register(User user);
}
