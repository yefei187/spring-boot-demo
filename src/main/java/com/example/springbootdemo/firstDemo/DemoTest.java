package com.example.springbootdemo.firstDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext
                context = new AnnotationConfigApplicationContext(DemoClassConfiguration.class);
        DemoClass demoClass = context.getBean(DemoClass.class);
        demoClass.sayHello();
    }
}
