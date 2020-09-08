package com.henrywoo.springbootapp.bean;

import lombok.Getter;
import lombok.Setter;

/**
 * @Author: Wuhao
 * @Date: Created in 2020-08-29 16:46
 * @Description: TODO
 * @Version: 1.0
 */
@Getter
@Setter
public class Blue {
    private int flag = 0;

    public Blue() {
        System.out.println("Blue loading");
    }
}
