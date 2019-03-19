package com.tangkc.pagehelper.controller;

import com.github.pagehelper.PageInfo;
import com.tangkc.pagehelper.entity.UserInfo;
import com.tangkc.pagehelper.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author tangkc
 * @title: UserController
 * @description: TODO
 * @date 2019-03-19
 */
@Controller
public class UserController {
    @Resource
    UserService userService;

    @ResponseBody
    @RequestMapping("/findAll")
    public PageInfo<UserInfo> findAll(){
        PageInfo<UserInfo> page = userService.findAll();
        return page;
    }
}
