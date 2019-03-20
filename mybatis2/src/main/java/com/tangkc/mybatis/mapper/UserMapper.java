package com.tangkc.mybatis.mapper;

import com.tangkc.mybatis.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@SuppressWarnings("ALL")
@Mapper
public interface UserMapper {
    public List<UserInfo> findAll();
}
