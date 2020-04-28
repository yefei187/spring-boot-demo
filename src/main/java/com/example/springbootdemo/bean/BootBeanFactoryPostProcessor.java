package com.example.springbootdemo.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.PropertyValue;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component
public class BootBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(
            ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        BeanDefinition userBeanLife = configurableListableBeanFactory.getBeanDefinition("userBeanLife");
        MutablePropertyValues propertyValues = userBeanLife.getPropertyValues();
        String aa = "";
        for(PropertyValue pv:propertyValues) {
            aa += pv.getName()+"="+pv.getValue();
        }
        System.out.println("【BootBeanFactoryPostProcessor】修改前的属性"+aa);

//        userBeanLife.getPropertyValues().addPropertyValue(
//                new PropertyValue("desc","这是在BootBeanFactoryPostProcessor设置的属性描述"));

        System.out.println("【BootBeanFactoryPostProcessor】的postProcessBeanFactory执行");

    }
}
