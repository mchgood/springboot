package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Auther: lenovo
 * @Date: 2019-06-30 12:44
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient
public class SerivceCloudApplication {
    public static void main(String[] args) {
        SpringApplication.run(SerivceCloudApplication.class,args);
    }
}
