package com.springcloud.service.impl;

import com.springcloud.service.AdminService;
import org.springframework.stereotype.Component;

/**
 * @Auther: lenovo
 * @Date: 2019-06-30 14:44
 * @Description:
 */
@Component
public class AdminServiceImpl implements AdminService {
    @Override
    public String sayHi(String msg) {
        return "feign error,bad request";
    }
}
