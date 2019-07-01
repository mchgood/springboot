package com.springcloud.controller;

import com.springcloud.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: lenovo
 * @Date: 2019-06-30 13:28
 * @Description:
 */
@RestController
public class AdminController {
    @Autowired
    AdminService adminService;

    @GetMapping("/hi")
    public String sayHi(String msg){
        return adminService.sayHi(msg);
    }
}
