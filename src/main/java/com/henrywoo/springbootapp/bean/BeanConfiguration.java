package com.henrywoo.springbootapp.bean;

import org.springframework.context.annotation.*;

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

//    @Bean()
//    public Blue blue(){
//        System.out.println("not primary blue");
//        return new Blue();
//    }
//
//    @Primary
//    @Bean
//    public Blue blue2(){
//        System.out.println( "primary blue...");
//        Blue blue = new Blue();
//        blue.setFlag(2);
//        return blue;
//    }

    @Bean
    public BeanLifeCycleInterface beanLifeCycleInterface(){
        return new BeanLifeCycleInterface();
    }


}
