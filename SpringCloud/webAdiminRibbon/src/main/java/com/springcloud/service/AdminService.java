package com.springcloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: lenovo
 * @Date: 2019-06-30 13:25
 * @Description:
 */
@Service
public class AdminService {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String sayHi(String msg){
        return restTemplate.getForObject("http://hello-spring-cloud-service-admin/hi?msg="+msg,String.class);
    }

    public String hiError(String msg){
        return String.format("ribbon error, bad request");
    }
}
