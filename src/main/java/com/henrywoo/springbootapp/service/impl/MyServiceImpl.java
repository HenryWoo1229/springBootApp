package com.henrywoo.springbootapp.service.impl;

import com.henrywoo.springbootapp.dao.AppDao;
import com.henrywoo.springbootapp.mapper.MyMapper;
import com.henrywoo.springbootapp.service.MyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@Slf4j
public class MyServiceImpl implements MyService {
    @Resource
    MyMapper myMapper;

    @Override
    public int insertData(AppDao appDao) {
        log.debug("[MyServiceImpl] insertData");
        return myMapper.insertData(appDao);
    }
}
