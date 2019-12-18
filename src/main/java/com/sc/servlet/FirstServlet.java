package com.sc.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: sunchao
 * @Description: SpringBoot整合Servlet方式一,等同于在xml文件中配置如下：
 *  <servlet>
 *      <servlet-name>FirstServlet</servlet-name>
 *      <servlet-class>com.sc.servlet.FirstServlet</servlet-class>
 *  </servlet>
 *  <servlet-mapping>
 *      <serlvet-name>FirstServlet</serlvet-name>
 *      <url-pattern>/first</url-pattern>
 *  </servlet-mapping>
 * @Date: Create in 21:24 2019/12/18
 * @Modified By: sunchao
 */
@WebServlet(name = "FirstServlet",urlPatterns = "/first")
public class FirstServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("FirstServlet");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
