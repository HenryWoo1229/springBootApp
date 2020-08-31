package com.henrywoo.springbootapp.controller;

import com.henrywoo.springbootapp.dao.AppDao;
import com.henrywoo.springbootapp.service.MyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

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
}
