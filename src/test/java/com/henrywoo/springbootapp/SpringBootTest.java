package com.henrywoo.springbootapp;

import com.henrywoo.springbootapp.bean.Blue;
import com.henrywoo.springbootapp.entity.MySelf;
import com.henrywoo.springbootapp.entity.MySelf2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;

/**
 * @Author: Wuhao
 * @Date: Created in 2020-08-31 07:55
 * @Description: TODO
 * @Version: 1.0
 */
@RunWith(SpringRunner.class)
@org.springframework.boot.test.context.SpringBootTest
public class SpringBootTest {
    @Autowired
    MySelf mySelf;
    @Autowired
    MySelf2 mySelf2;
    @Autowired()
    private Blue blue;
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Autowired
    DataSource dataSource;

    @Test
    public void test01() {
        System.out.println(mySelf);
        System.out.println(mySelf2);
    }
    @Test
    public void test2(){
        dataSource.getClass();
    }
}
