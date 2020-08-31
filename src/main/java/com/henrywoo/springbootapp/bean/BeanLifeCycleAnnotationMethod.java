package com.henrywoo.springbootapp.bean;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @Author: Wuhao
 * @Date: Created in 2020-08-29 17:48
 * @Description: TODO
 * @Version: 1.0
 */
@Component
public class BeanLifeCycleAnnotationMethod {

    @PostConstruct
    public void init(){
        System.out.println("BeanLifeCycleAnnotationMethod init...");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("BeanLifeCycleAnnotationMethod destroy...");
    }
}
