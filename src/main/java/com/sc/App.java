package com.sc;

import com.sc.filter.SecondFilter;
import com.sc.listener.SecondListener;
import com.sc.servlet.SecondServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import javax.servlet.Servlet;

/**
 * @Author: sunchao
 * @Description: SpringBoot的启动类
 * @Date: Create in 21:11 2019/12/18
 * @Modified By: sunchao
 */
@SpringBootApplication
//@ServletComponentScan // 在springboot启动时会扫描@webservlet，并将该类实例化
public class App {
    public static void main(String[] args){
        //TODO start springboot
        SpringApplication.run(App.class,args);
    }

    @Bean
    public ServletRegistrationBean getServletRegistrationBean(){
        ServletRegistrationBean bean = new ServletRegistrationBean(new SecondServlet());
        bean.addUrlMappings("/second");
        return bean;
    }

    @Bean
    public FilterRegistrationBean getFilterRegistrationBean(){
        FilterRegistrationBean bean = new FilterRegistrationBean(new SecondFilter());
//        bean.addUrlPatterns("*.do","*.jsp");
        bean.addUrlPatterns("/second");
        return bean;
    }

    @Bean
    public ServletListenerRegistrationBean getServletListenerRegistrationBean(){
        ServletListenerRegistrationBean<SecondListener> bean =
                new ServletListenerRegistrationBean<SecondListener>(new SecondListener());
        return bean;
    }
}
