package com.henrywoo.springbootapp.controller;

import com.henrywoo.springbootapp.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: Wuhao
 * @Date: Created in 2020-09-03 08:29
 * @Description: TODO
 * @Version: 1.0
 */
@Controller
public class EmployeeController {

    @Autowired
    EmployeeDao employeeDao;
    /**
     * 查询所有员工列表页
     * @return
     */
    @GetMapping("/emps")
    public String list(ModelMap modelMap){
        // 将数据放在请求域中，用 Model, Map, ModelMap 都可以
        // Model 的话是 setAttribute
        modelMap.put("emps", employeeDao.getAll());

        // thymeleaf 默认配置会拼接字符串为
        // classpath:/thymeleaf/xxx.html
        return "emp/list";
    }
}
