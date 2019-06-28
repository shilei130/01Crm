package com.bjpowernode.crm.settings.web.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Author:
 */
public class UserController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest requst, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("进入到模块控制器");

        String path=requst.getServletPath();
        if ("/setting/user/xxx.do".equals(path)){
          //  xxx(request,response);
        }else if ("/setting/user/xxx.do".equals(path)){
            //  xxx(request,response);
        }

    }
}
