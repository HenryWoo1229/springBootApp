package com.henrywoo.springbootapp.controller;

import org.springframework.stereotype.Controller;

/**
 * @Author: Wuhao
 * @Date: Created in 2020-09-03 08:29
 * @Description: TODO
 * @Version: 1.0
 */
@Controller
public class EmployeeController {

    /**
     * 查询所有员工列表页
     * @return
     */
    public String list(){

        // thymeleaf 默认配置会拼接字符串为
        // classpath:/thymeleaf/xxx.html
        return "emp/list";
    }
}
