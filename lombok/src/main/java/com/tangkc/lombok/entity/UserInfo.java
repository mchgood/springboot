package com.tangkc.lombok.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author tangkc
 * @title: UserInfo
 * @description: TODO
 * @date 2019-03-20
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfo {
    private String userName;
    private String passWord;
}
