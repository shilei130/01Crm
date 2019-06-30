package com.bjpowernode.crm.web.filter;

import com.bjpowernode.crm.settings.domain.User;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Author:
 */
public class LoginFilter implements Filter {
    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {

        System.out.println("执行判断有没有登陆过过滤器");

        HttpServletRequest request= (HttpServletRequest) req;
        HttpServletResponse response= (HttpServletResponse) resp;

        String path=request.getServletPath();
        System.out.println(path);

        if ("/login.jsp".equals(path)||"/settings/user/login.do".equals(path)){
            chain.doFilter(req, resp);
        }else{
            User user = (User) request.getSession().getAttribute("user");

            if (user!=null){
                chain.doFilter(req, resp);
            }else {

                response.sendRedirect(request.getContextPath()+"/login.jsp");
            }
        }


    }
}
