package com.henrywoo.springbootapp.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @Author: Wuhao
 * @Date: Created in 2020-08-29 20:11
 * @Description: TODO
 * @Version: 1.0
 */
@Component
public class BeanLifeCyclePostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
//        System.out.println("AfterInitialization-->"+beanName);
        return bean;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
//        System.out.println("BeforeInitialization-->"+beanName);
        return bean;
    }
}
