package com.huarui.zls.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ Author :许孔妤
 * @ Date :Created in 17:30 2019/4/2
 * @ Description:登录界面控制层
 */
@Controller

public class LoginController {
    @RequestMapping("/login")
    public String login(){
        return "login";
    }
}
