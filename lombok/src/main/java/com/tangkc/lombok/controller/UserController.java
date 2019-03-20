package com.tangkc.lombok.controller;

import com.tangkc.lombok.entity.UserInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author tangkc
 * @title: UserController
 * @description: TODO
 * @date 2019-03-20
 */
@Controller
public class UserController {

    @ResponseBody
    @RequestMapping("/findAll")
    public UserInfo findAll(){
        UserInfo userInfo = new UserInfo();
        userInfo.setUserName("tangkc");
        userInfo.setPassWord("123456");
        return userInfo;
    }
}
