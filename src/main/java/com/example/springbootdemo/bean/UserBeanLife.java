package com.example.springbootdemo.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

//@Component
public class UserBeanLife implements
        BeanFactoryAware, BeanNameAware,
        EnvironmentAware, ApplicationContextAware,
        InitializingBean,
        DisposableBean {


    public UserBeanLife() {
        System.out.println("UserBeanLife的构造器开始执行");
    }

    private String beanTestName;
    private String len;

    private BootBeanPostProcessor bootBeanPostProcessor;
    private BootInstantiationAwareBeanPostProcessor instantiationAwareBeanPostProcessor;
    private Person person;

//    @Autowired
    public void setPerson(Person person) {
        System.out.println("【PropertyValue】的setPerson开始执行");
        this.person = person;
    }

    public void setInstantiationAwareBeanPostProcessor(BootInstantiationAwareBeanPostProcessor instantiationAwareBeanPostProcessor) {
        System.out.println("【PropertyValue】的setInstantiationAwareBeanPostProcessor开始执行");
        this.instantiationAwareBeanPostProcessor = instantiationAwareBeanPostProcessor;
    }

    public BootBeanPostProcessor getBootBeanPostProcessor() {
        return bootBeanPostProcessor;
    }

//    @Autowired
    public void setBootBeanPostProcessor(BootBeanPostProcessor bootBeanPostProcessor) {
        System.out.println("【PropertyValue】的setBootBeanPostProcessor开始执行");
        this.bootBeanPostProcessor = bootBeanPostProcessor;
    }

    public void myInit(){
        System.out.println("【init-method自定义】的myInit开始执行");
    }

    public void myDestroy(){
        System.out.println("【destroy-method自定义】的myDestroy开始执行");
    }

    public void setBeanTestName(String beanTestName) {
        System.out.println("【PropertyValue】的setBeanTestName开始执行");
        this.beanTestName = beanTestName;
    }

    public void setLen(String len) {
        System.out.println("【PropertyValue】的setLen开始执行");
        this.len = len;
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("【BeanFactoryAware】的setBeanFactory开始执行");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("【BeanNameAware】的setBeanName开始执行");
    }

    @Override
    public void setEnvironment(Environment environment) {
        System.out.println("【EnvironmentAware】的setEnvironment开始执行");
    }


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("【ApplicationContextAware】的setApplicationContext开始执行");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("【InitializingBean】afterPropertiesSet开始执行");
    }

//    @Override
//    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
//        System.out.println("【BeanPostProcessor】的postProcessBeforeInitialization开始执行");
//        return bean;
//    }
//
//    @Override
//    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
//        System.out.println("【BeanPostProcessor】的postProcessAfterInitialization开始执行");
//        return bean;
//    }
//
//    @Override
//    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
//        System.out.println("【InstantiationAwareBeanPostProcessor】的postProcessBeforeInstantiation开始执行");
//        return null;
//    }
//
//    @Override
//    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
//        System.out.println("【InstantiationAwareBeanPostProcessor】的postProcessAfterInstantiation开始执行");
//        return false;
//    }

    public void run(){
        System.out.println("run开始执行");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("【DisposableBean】的destroy开始执行");
    }
}
