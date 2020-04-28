package com.example.springbootdemo.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component
public class BootBeanPostProcessor implements BeanPostProcessor {


    public BootBeanPostProcessor() {
        System.out.println("BootBeanPostProcessor构造函数");
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("【BeanPostProcessor】的postProcessBeforeInitialization开始执行");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("【BeanPostProcessor】的postProcessBeforeInitialization开始执行");
        return bean;
    }
}
