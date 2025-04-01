package com.hnust.controller;


import com.hnust.bean.User;
import com.hnust.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 袁权
 * @version 1.0
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 注册用户
     * @param user
     * @return
     */
    @RequestMapping("/register")
    public String register(User user) {
        int res = 0;
        try {
            res = userService.register(user);
            if (res == 1) {
                return "ok";
            }
        } catch (Exception e) {  //防止username重复报错
            return "exsist";
        }
        return "exsist";
    }

    /**
     * 登录校验
     * @param user
     * @return
     */
    @RequestMapping("/login")
    public String login(User user){
        User user1 = userService.login(user);
        if(user1 != null && user1.getPassword().equals(user.getPassword())){
                return "success";
        }
        return "error";
    }

    /**
     * 首页
     * @return
     */
    @RequestMapping("/index")
    public String toIndex(User user){
        int res = userService.register(user);
        return "index";
    }

    /**
     * 登录页面
     * @return
     */
    @RequestMapping("/toLogin")
    public String toLogin(){
        return "toLogin";
    }

    /**
     * 注册页面
     * @return
     */
    @RequestMapping("/toRegister")
    public String toRegister(){
        return "toRegister";
    }
}
