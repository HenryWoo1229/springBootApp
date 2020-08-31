package com.henrywoo.springbootapp.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

/**
 * @Author: Wuhao
 * @Date: Created in 2020-08-29 16:41
 * @Description: TODO
 * @Version: 1.0
 */
@Configuration
@Import({Blue.class, Red.class, MyImportSelector.class, MyImportBeanDefinitionRegistrar.class})
public class BeanConfiguration {

    @Bean
    @Scope("prototype")
    public MyBean myBean() {
        return new MyBean();
    }
//
//    @Bean(initMethod = "init", destroyMethod = "destroy")
//    public BeanLifeCycleAnnotation beanLifeCycle(){
//        return new BeanLifeCycleAnnotation();
//    }

    @Bean
    public BeanLifeCycleInterface beanLifeCycleInterface(){
        return new BeanLifeCycleInterface();
    }


}
