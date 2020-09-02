package com.henrywoo.springbootapp.controller;

import com.henrywoo.springbootapp.dao.AppDao;
import com.henrywoo.springbootapp.service.MyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@Slf4j
public class MyController {
    @Autowired
    MyService myService;

    @PostMapping("insert")
    @ResponseBody
    public String insertData(@RequestBody AppDao appDao) {
        log.debug("POST 请求过来了");
        int code = myService.insertData(appDao);
        return code > 0 ? "SUCCESS" : "FAILED";
    }

    @RequestMapping("/success")
    public String success(){
        // 模板引擎自动组装页面 classpath:/templates/success.html
        // 注意不能有 @ResponseBody，否则返回字符串了
        return "success";
    }

    @GetMapping({"/", "/index"})
    public String index(){
        return "index";
    }
}
