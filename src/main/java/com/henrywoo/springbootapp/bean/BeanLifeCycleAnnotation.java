package com.henrywoo.springbootapp.bean;

/**
 * @Author: Wuhao
 * @Date: Created in 2020-08-29 17:28
 * @Description: TODO
 * @Version: 1.0
 */
public class BeanLifeCycleAnnotation {
    public void init(){
        System.out.println("BeanLifeCycleAnnotation init...");
    }

    public void destroy(){
        System.out.println("BeanLifeCycleAnnotation destroy...");
    }
}
