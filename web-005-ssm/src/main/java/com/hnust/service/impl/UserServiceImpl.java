package com.hnust.service.impl;

import com.hnust.bean.User;
import com.hnust.mapper.UserMapper;
import com.hnust.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 袁权
 * @version 1.0
 */
@Transactional
@Service("userService")
public class UserServiceImpl implements UserService {

    //private UserMapper userMapper = (UserMapper) SqlSessionUtil.openSession().getMapper(UserMapper.class);


    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(User user) {
        return userMapper.selectUserByUser(user);
    }

    @Override
    public int register(User user) {
        return userMapper.insertUser(user);
    }
}
