package com.henrywoo.springbootapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @Author: Wuhao
 * @Date: Created in 2020-09-02 08:41
 * @Description: TODO
 * @Version: 1.0
 */
@Controller
public class LoginController {

    @PostMapping("/user/login")
    public String userLogin(@RequestParam("username") String userName,
                            @RequestParam("password") String password,
                            Map<String, Object> map, HttpSession session) {
        if (!StringUtils.isEmpty(userName) && "123456".equals(password)) {
            // 这样写会出现表单重复提交问题，改为重定向到 main.html，在视图解析器 WebMvcConfigurer 中已经映射
//            return "dashboard";

            // 添加一个 session，用作拦截器的判断
            session.setAttribute("loginUser", userName);

            // 如果不重定向，那么路径是以 /user/login 结束，则找不到 dashboard 对应的 css，js 资源（位于../assert/），因此要重定向到一个根路径下
            return "redirect:/main.html";
        } else {
            map.put("msg", "用户名密码错误");
            return "login";
        }
    }
}
