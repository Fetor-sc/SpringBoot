package com.sc.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @Author: sunchao
 * @Description: SpringBoot整合Filter方式二
 * @Date: Create in 21:37 2019/12/18
 * @Modified By: sunchao
 */
public class SecondFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("进入secondFilter");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("离开secondFilter");
    }

    @Override
    public void destroy() {

    }
}
