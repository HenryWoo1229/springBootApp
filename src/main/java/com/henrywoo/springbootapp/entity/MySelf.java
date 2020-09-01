package com.henrywoo.springbootapp.entity;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author: Wuhao
 * @Date: Created in 2020-08-31 08:13
 * @Description: TODO
 * @Version: 1.0
 */
@Component
@Data
public class MySelf {
    @Value("${global.name}")
    private String name;
    @Value("${global.age}")
    private int age;
    @Value("${global.gender}")
    private int gender;
}
