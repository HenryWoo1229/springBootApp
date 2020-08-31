package com.henrywoo.springbootapp.bean;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @Author: Wuhao
 * @Date: Created in 2020-08-29 22:01
 * @Description: TODO
 * @Version: 1.0
 */
public class GetApplicationContext implements ApplicationContextAware {
    private ApplicationContext context;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }
}
