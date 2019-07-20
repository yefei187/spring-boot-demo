package com.example.springbootdemo.secondDemo.other;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OtherConfiguration {
    @Bean
    public OtherBean otherBean(){
        return new OtherBean();
    }
}
