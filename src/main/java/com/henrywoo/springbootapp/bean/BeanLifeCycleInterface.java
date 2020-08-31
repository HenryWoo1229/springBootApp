package com.henrywoo.springbootapp.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @Author: Wuhao
 * @Date: Created in 2020-08-29 17:42
 * @Description: TODO
 * @Version: 1.0
 */
public class BeanLifeCycleInterface implements InitializingBean, DisposableBean {
    @Override
    public void destroy() throws Exception {
        System.out.println("BeanLifeCycleInterface destroy...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("BeanLifeCycleInterface init...");
    }
}
