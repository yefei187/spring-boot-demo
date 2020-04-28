package com.example.springbootdemo.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;

public class BootInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {


    public BootInstantiationAwareBeanPostProcessor() {
        System.out.println("BootInstantiationAwareBeanPostProcessor构造函数");
    }

    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        System.out.println("【InstantiationAwareBeanPostProcessor】的postProcessBeforeInstantiation开始执行");

        return null;
    }

    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        System.out.println("【postProcessAfterInstantiation】的bean="+bean);
        System.out.println("【postProcessAfterInstantiation】的bean="+beanName);
        System.out.println("【InstantiationAwareBeanPostProcessor】的postProcessAfterInstantiation开始执行");
        return true;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("【InstantiationAwareBeanPostProcessor】的postProcessBeforeInitialization开始执行");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("【InstantiationAwareBeanPostProcessor】的postProcessAfterInitialization开始执行");
        return bean;
    }
}
