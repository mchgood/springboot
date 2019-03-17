package com.tangkc.mybatis.mapper;

import com.tangkc.mybatis.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    public List<UserInfo> findAll();
}
