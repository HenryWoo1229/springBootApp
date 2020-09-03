package com.henrywoo.springbootapp.config;

import com.henrywoo.springbootapp.component.LoginHandlerInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
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
        registry.addViewController("/").setViewName("login");
        registry.addViewController("/index.html").setViewName("login");
        // 添加这个视图映射，避免登录成功后表单重复提交
        registry.addViewController("/main.html").setViewName("dashboard");
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 拦截 /** 表示所有请求，然后再排除掉登录页面和静态资源即可
        // 当然也可以直接拦截指定页面
        registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**")
                .excludePathPatterns("/index.html", "/", "/user/login", "/asserts/**", "/webjars/**");
    }
}
