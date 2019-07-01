package com.springcloud.service;

import com.springcloud.service.impl.AdminServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Auther: lenovo
 * @Date: 2019-06-30 14:25
 * @Description:
 */
@FeignClient(value = "hello-spring-cloud-service-admin",fallback = AdminServiceImpl.class)
public interface AdminService {
    @RequestMapping(value = "hi", method = RequestMethod.GET)
    public String sayHi(@RequestParam(value = "msg") String msg);
}
