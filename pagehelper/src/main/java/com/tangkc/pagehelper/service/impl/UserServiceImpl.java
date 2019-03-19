package com.tangkc.pagehelper.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tangkc.pagehelper.entity.UserInfo;
import com.tangkc.pagehelper.mapper.UserMapper;
import com.tangkc.pagehelper.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author tangkc
 * @title: UserServiceImpl
 * @description: TODO
 * @date 2019-03-19
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper userMapper;

    @Override
    public PageInfo<UserInfo> findAll() {
        PageHelper.startPage(1, 3);
        PageInfo<UserInfo> page = PageInfo.of(userMapper.findAll());
        return page;
    }
}
