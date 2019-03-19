package com.tangkc.pagehelper.mapper;

import com.tangkc.pagehelper.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author tangkc
 * @title: UserMapper
 * @description: TODO
 * @date 2019-03-19
 */
@Mapper
public interface UserMapper {

    @Select("SELECT * FROM tb_users")
    public List<UserInfo> findAll();
}
