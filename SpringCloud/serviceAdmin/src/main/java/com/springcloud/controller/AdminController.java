package com.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: lenovo
 * @Date: 2019-06-30 12:53
 * @Description:
 */
@RestController
public class AdminController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/hi")
    public String sayHi(String msg){
        return String.format("端口号为：%s。消息内容为：%s",port,msg);
    }
}
