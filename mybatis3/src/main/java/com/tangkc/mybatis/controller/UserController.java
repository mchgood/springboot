package com.tangkc.mybatis.controller;

import com.tangkc.mybatis.dao.BaseDao;
import com.tangkc.mybatis.entity.UserInfo;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

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
    BaseDao baseDao;

    public List<UserInfo> findAll(){
        return SqlSessionTemplate
    }
}
