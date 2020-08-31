package com.henrywoo.springbootapp;

import com.henrywoo.springbootapp.bean.BeanConfiguration;
import com.henrywoo.springbootapp.bean.MyFactoryBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: Wuhao
 * @Date: Created in 2020-08-29 23:12
 * @Description: TODO
 * @Version: 1.0
 */
public class SpringTest {
    @Test
    public void test1(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(MyFactoryBean.class, BeanConfiguration.class);
        context.refresh();

        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String s: beanDefinitionNames){
            System.out.println(s);
        }
        System.out.println("启动SpringBoot，调用 AnnotationConfigApplicationContext.getBean 前");
        Object myFactoryBean = context.getBean("myFactoryBean");
        System.out.println("调用 AnnotationConfigApplicationContext.getBean 后");
        System.out.println(myFactoryBean.getClass());

        Object mybean = context.getBean("myBean");
        Object mybean2 = context.getBean("myBean");
        System.out.println(mybean==mybean2);
    }
}
