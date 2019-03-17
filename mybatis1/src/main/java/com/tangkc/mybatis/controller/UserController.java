package com.tangkc.mybatis.controller;

import com.tangkc.mybatis.mapper.UserDao;
import com.tangkc.mybatis.pojo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author tangkc
 * @title: UserController
 * @description: TODO
 * @date 2019-03-18
 */
@Controller
public class UserController {
    @Autowired
    UserDao userDao;

    @ResponseBody
    @RequestMapping("/findAll")
    public List<UserInfo> findAll(){
        List<UserInfo> users = userDao.findAll();
        return users;
    }
}
