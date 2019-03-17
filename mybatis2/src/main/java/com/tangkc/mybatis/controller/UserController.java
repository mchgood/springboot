package com.tangkc.mybatis.controller;

import com.tangkc.mybatis.entity.UserInfo;
import com.tangkc.mybatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author tangkc
 * @title: UserController
 * @description: TODO
 * @date 2019-03-18
 */
@Controller
public class UserController {
    @Resource
    UserMapper userMapper;

    @ResponseBody
    @RequestMapping("/findAll")
    public List<UserInfo> findAll(){
        return userMapper.findAll();
    }
}
