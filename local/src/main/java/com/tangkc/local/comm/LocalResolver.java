package com.tangkc.local.comm;

import org.springframework.web.servlet.LocaleResolver;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * @author tangkc
 * @title: LocalResolver
 * @description: TODO
 * @date 2019-03-25
 */
public class LocalResolver implements LocaleResolver {
    @Override
    public Locale resolveLocale(HttpServletRequest httpServletRequest) {
        String l = httpServletRequest.getParameter("l");
        //默认获取系统语言环境
        Locale local= Locale.getDefault();

        if(!StringUtils.isEmpty(l)){
            String[] s = l.split("_");
            local = new Locale(s[0], s[1]);
        }
        return local;
    }

    @Override
    public void setLocale(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Locale locale) {

    }
}
