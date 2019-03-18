package com.tangkc.mybatis.controller;

import com.tangkc.mybatis.mapper.BaseDao;
import com.tangkc.mybatis.entity.UserInfo;
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
    BaseDao baseDao;

    @ResponseBody
    @RequestMapping("/findAll")
    public List<UserInfo> findAll(){
        List<UserInfo> list = (List<UserInfo>)baseDao.findForList("com.tangkc.mybatis.mapper.UserMapper.findAll", UserInfo.class);
        return list;
    }
}
