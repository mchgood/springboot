package com.tangkc.local.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @author tangkc
 * @title: UserController
 * @description: TODO
 * @date 2019-03-30
 */
@Controller
public class UserController {

    @RequestMapping("/user/login")
    public String login(@RequestParam("username") String username,
                     @RequestParam("password") String password,
                     Map<String,Object> map,
                     HttpSession session){
        //如果账号和用户名不为空
        if (!StringUtils.isEmpty(username) && !StringUtils.isEmpty(password)){
            if("tangkc".equals(username) && "tangkc".equals(password)){
                session.setAttribute("userinfo", username);
                //使用重定向，添加新的重定向规则，防止表单重复提交
                return "redirect:/dashboard";
            }else {
                map.put("msg", "账号或者密码错误");
                //此处不能重定向，只能转发，否则请求域参数带不过去
                return "index";
            }
        }else {
            map.put("msg", "账号或者密码不能为空");
            //此处不能重定向，只能转发，否则请求域参数带不过去
            return "index";
        }
    }
}
