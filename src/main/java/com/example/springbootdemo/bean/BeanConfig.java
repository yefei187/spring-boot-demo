package com.example.springbootdemo.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {


    @Bean
    public UserBeanLife userBeanLife(){
        return new UserBeanLife();
    }
    @Bean
    public BootBeanPostProcessor bootBeanPostProcessor(){
        return new BootBeanPostProcessor();
    }
    @Bean
    public Person person(){
        return new Person();
    }
}
