package com.henrywoo.springbootapp.bean;

import lombok.Data;

/**
 * @Author: Wuhao
 * @Date: Created in 2020-08-29 16:38
 * @Description: TODO
 * @Version: 1.0
 */
@Data
public class MyBean {
    private int id;
    private String name;
    private int age;

    public MyBean() {
        System.out.println("MyBean Load...");
    }
}
