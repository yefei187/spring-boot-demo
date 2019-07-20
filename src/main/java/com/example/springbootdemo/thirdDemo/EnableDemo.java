package com.example.springbootdemo.thirdDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableDefineService(exclude = {LoggerService.class})
public class EnableDemo {
    public static void main(String[] args) {
        ConfigurableApplicationContext run =
                SpringApplication.run(EnableDemo.class);
        System.out.println(run.getBean(LoggerService.class));
        System.out.println(run.getBean(CacheService.class));

    }
}
