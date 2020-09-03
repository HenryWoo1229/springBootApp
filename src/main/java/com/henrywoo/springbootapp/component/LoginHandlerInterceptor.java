package com.henrywoo.springbootapp.component;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: Wuhao
 * @Date: Created in 2020-09-02 20:23
 * @Description: 进行登录检查，拦截器
 * 1，可以先在 controller 层设置一个 session
 * 2，在 preHandle 中对是否登录做判断
 * 3，在 WebMvcConfigurer 中添加拦截器
 * @Version: 1.0
 */
public class LoginHandlerInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object loginUser = request.getSession().getAttribute("loginUser");
        if (loginUser == null){
            // 没有登录, 返回到登录页面
            // msg 在页面中已经添加获取值，所以这里用 msg 作为 key
            request.setAttribute("msg", "没有权限请先登录");
            request.getRequestDispatcher("/index.html").forward(request, response);
        }else {
            return true;
        }
        return false;
    }
}
