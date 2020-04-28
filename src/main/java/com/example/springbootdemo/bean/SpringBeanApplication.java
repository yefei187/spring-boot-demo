package com.example.springbootdemo.bean;


import com.example.springbootdemo.firstDemo.DemoClassConfiguration;
import com.example.springbootdemo.secondDemo.courrent.SpringConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringBeanApplication {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:config.xml");
//        AnnotationConfigApplicationContext
//                context = new AnnotationConfigApplicationContext(BeanConfig.class);
        UserBeanLife userBeanLife = (UserBeanLife) context.getBean("userBeanLife");
        BootBeanPostProcessor bootBeanPostProcessor = userBeanLife.getBootBeanPostProcessor();
        System.out.println(bootBeanPostProcessor);
        userBeanLife.run();
        ((ClassPathXmlApplicationContext)context).registerShutdownHook();

//        new ClassPathXmlApplicationContext("classpath:config.xml");

    }
}
