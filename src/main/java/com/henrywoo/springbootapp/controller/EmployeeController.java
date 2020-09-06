package com.henrywoo.springbootapp.controller;

import com.henrywoo.springbootapp.dao.DepartmentDao;
import com.henrywoo.springbootapp.dao.EmployeeDao;
import com.henrywoo.springbootapp.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

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
    @Autowired
    DepartmentDao departmentDao;

    /**
     * 查询所有员工列表页
     *
     * @return
     */
    @GetMapping("/emps")
    public String list(ModelMap modelMap) {
        // 将数据放在请求域中，用 Model, Map, ModelMap 都可以
        // Model 的话是 setAttribute
        modelMap.put("emps", employeeDao.getAll());

        // thymeleaf 默认配置会拼接字符串为
        // classpath:/thymeleaf/xxx.html
        return "emp/list";
    }

    @GetMapping("/emp")
    public String toAddPage(Model model) {
        model.addAttribute("depts", departmentDao.getDepartments());
        return "emp/add";
    }

    @GetMapping("/emp/{id}")
    public String toEditPage(@PathVariable("id") Integer id, ModelMap map) {
        Employee employee = employeeDao.get(id);
        // 这里返回要编辑的员工信息，数据返回给前端页面先显示出来
        map.put("emp", employee);
        map.put("depts", departmentDao.getDepartments());
        // 这里采用 add 页面和 edit 页面合在一个页面里的做法（页面中搞一些判断，耦合度太高，不推荐，但是学习时可以用），
        // 当然也可以单独再搞一个 edit 页面(这种耦合度低一些，好做一些)
        return "emp/add";
    }

    @PutMapping("/emp")
    public String editEmp(Employee emp){
        employeeDao.save(emp);
        return "redirect:/emps";
    }

    @PostMapping("/emp")
    public String addEmp(Employee employee) {
        employeeDao.save(employee);
        // redirect: 表示重定向到一个地址
        // forward: 表示转发到一个地址
        // 想要回到员工列表页，不能直接返回 /emps，因为模板引擎会拼接路径为 thymeleaf/emps.html，所以这里采用重定向
        return "redirect:/emps";
    }
}
