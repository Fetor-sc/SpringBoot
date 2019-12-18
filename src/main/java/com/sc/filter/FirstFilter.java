package com.sc.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.util.logging.LogRecord;

/**
 * @Author: sunchao
 * @Description: SpringBoot整合Filter方式一
 *      <filter>
 *          <filter-name>FirstFilter</filter-name>
 *          <filter-class>com.sc.filter.FirstFilter</filter-class>
 *      </filter>
 *      <filter-mapping>
 *          <filter-name>FirstFilter</filter-name>
 *          <url-pattern>/first</url-pattern>
 *      </filter-mapping>
 * @Date: Create in 21:37 2019/12/18
 * @Modified By: sunchao
 */
//@WebServlet(name = "FirstFilter",urlPatterns = {"*.do","*.jsp"})
@WebFilter(filterName = "FirstFilter",urlPatterns = "/first")
public class FirstFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("进入Filter");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("离开Filter");
    }

    @Override
    public void destroy() {

    }
}
