package com.henrywoo.springbootapp.entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author: Wuhao
 * @Date: Created in 2020-08-31 08:17
 * @Description: TODO
 * @Version: 1.0
 */
@Component
@Data
@ConfigurationProperties(prefix = "global")
public class MySelf2 {
    private String name;
    private int age;
    private int gender;
    private String description;
}
