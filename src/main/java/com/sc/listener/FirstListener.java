package com.sc.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * @Author: sunchao
 * @Description: springboot整合Listener方式一
 *      <listener>
 *          <listener-class>com.sc.listener.FirstListener</listener-class>
 *      </listener>
 * @Date: Create in 22:05 2019/12/18
 * @Modified By: sunchao
 */
@WebListener
public class FirstListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("Listener...init....");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
