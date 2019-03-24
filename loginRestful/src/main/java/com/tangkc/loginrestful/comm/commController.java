package com.tangkc.loginrestful.comm;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author tangkc
 * @title: commController
 * @description: TODO
 * @date 2019-03-24
 */
@Controller
public class commController {

    @RequestMapping("/404")
    public String notFind(){
        return "404/404";
    }
}
