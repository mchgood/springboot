package com.tangkc.mybatis.mapper;

import com.tangkc.mybatis.pojo.UserInfo;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author tangkc
 * @title: UserDao
 * @description: TODO
 * @date 2019-03-18
 */
public interface UserDao {
    /**
     *
     * @return
     */
    @Select("SELECT * FROM tb_users")
    List<UserInfo> findAll();
}
