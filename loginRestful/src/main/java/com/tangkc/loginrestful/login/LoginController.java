package com.tangkc.loginrestful.login;

import com.tangkc.loginrestful.dao.UserDao;
import com.tangkc.loginrestful.entity.UserInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * @author tangkc
 * @title: LoginController
 * @description: TODO
 * @date 2019-03-24
 */
@Controller
public class LoginController {

    @Resource
    UserDao userDao;

    @RequestMapping("/login")
    public String login(@RequestParam("username")String username,
                        @RequestParam("password")String password,
                        Map<String, Object> map){
        UserInfo userInfo = new UserInfo();
        userInfo.setUserName(username);
        userInfo.setPassword(password);
        UserInfo dbUser = userDao.login(userInfo);
        if (dbUser == null){
            map.put("msg", "登陆失败");
        }else {
            map.put("msg", "登陆成功");
            map.put("username", username);
        }
        return "/success/success";
    }
}
