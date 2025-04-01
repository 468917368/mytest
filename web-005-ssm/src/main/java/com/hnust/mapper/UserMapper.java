package com.hnust.mapper;

import com.hnust.bean.User;
import org.springframework.stereotype.Repository;


/**
 *
 * UserMapper接口
 */
@Repository
public interface UserMapper {

    /**
     * 登录验证
     * @param user
     * @return
     */
    public User selectUserByUser(User user);

    /**
     * 注册
     * @param user
     * @return
     */
    public int insertUser(User user);
}
