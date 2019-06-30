package com.bjpowernode.crm.web.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * Author:
 */
public class EncodingFilter implements Filter {
    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
        System.out.println("进入到过滤字符编码的过滤器");

        //过滤post请求的中文参数
        req.setCharacterEncoding("utf-8");

        //过滤响应流中的中文参数
        resp.setContentType("text/html;charset=utf-8");

        //使用过滤器链chain请求放行
        chain.doFilter(req, resp);
    }
}
