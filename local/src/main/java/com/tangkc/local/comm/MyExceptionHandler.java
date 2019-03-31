package com.tangkc.local.comm;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * 1、通过@ControllerAdvice注解可以将对于控制器的全局配置放在同一个位置。
 * 2、注解了@Controller的类的方法可以使用@ExceptionHandler、@InitBinder、@ModelAttribute注解到方法上。
 * 3、@ControllerAdvice注解将作用在所有注解了@RequestMapping的控制器的方法上。
 * 4、@ExceptionHandler：用于全局处理控制器里的异常。
 * @author tangkc
 * @title: MyExceptionHandler
 * @description: TODO
 * @date 2019-03-30
 */
@ControllerAdvice
public class MyExceptionHandler {

    @ExceptionHandler(Exception.class)
    public String handleException(Exception e, HttpServletRequest request){
        Map<String,Object> map = new HashMap<>();
        //传入我们自己的错误状态码  4xx 5xx，否则就不会进入定制错误页面的解析流程
        request.setAttribute("javax.servlet.error.status_code",500);
        map.put("code","user.notexist");
        map.put("message",e.getMessage());
        //转发到/error
        return "forward:/error";
    }
}
