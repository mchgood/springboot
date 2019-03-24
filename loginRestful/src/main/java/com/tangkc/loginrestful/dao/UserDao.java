package com.tangkc.loginrestful.dao;

import com.tangkc.loginrestful.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author tangkc
 * @title: UserDao
 * @description: TODO
 * @date 2019-03-24
 */
@Mapper
public interface UserDao {

    /**
     * 登陆
     * @param userInfo  保存有登陆信息
     * @return
     */
    @Select("SELECT * FROM tb_users WHERE user_name=#{userName} and password=#{password}")
    public UserInfo login(UserInfo userInfo);
}
