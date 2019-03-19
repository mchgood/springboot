package com.tangkc.pagehelper.service;

import com.github.pagehelper.PageInfo;
import com.tangkc.pagehelper.entity.UserInfo;

import java.util.List;

public interface UserService {

    public PageInfo<UserInfo> findAll();
}
