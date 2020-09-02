package com.henrywoo.springbootapp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author: Wuhao
 * @Date: Created in 2020-09-01 19:48
 * @Description: TODO
 * @Version: 1.0
 */
// 加上下面的注解，将完全接管 spring MVC，那么 springMVC 的自动配置就失效了
//@EnableWebMvc
@Configuration
public class MyConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        // 将url请求映射到 success页面
        registry.addViewController("/viewController").setViewName("success");
    }
}
