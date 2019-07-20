package com.example.springbootdemo.firstDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoClassConfiguration {

    @Bean
    public DemoClass demoClass(){
        return new DemoClass();
    }
}
