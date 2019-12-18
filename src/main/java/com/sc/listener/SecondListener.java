package com.sc.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * @Author: sunchao
 * @Description: springboot整合Listener方式二
 * @Date: Create in 22:05 2019/12/18
 * @Modified By: sunchao
 */
@WebListener
public class SecondListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("SecondListener...init....");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
