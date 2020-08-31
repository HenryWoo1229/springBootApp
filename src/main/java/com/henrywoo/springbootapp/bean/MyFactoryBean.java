package com.henrywoo.springbootapp.bean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * @Author: Wuhao
 * @Date: Created in 2020-08-29 17:09
 * @Description: TODO
 * @Version: 1.0
 */
@Component
public class MyFactoryBean implements FactoryBean<Black> {

    public MyFactoryBean() {
        System.out.println("factory bean");
    }

    @Override
    public Black getObject() throws Exception {
        System.out.println("getObject-------------");
        return new Black();
    }

    @Override
    public Class<?> getObjectType() {
        return Black.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
