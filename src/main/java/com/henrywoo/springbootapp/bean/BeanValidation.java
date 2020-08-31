package com.henrywoo.springbootapp.bean;

import org.springframework.validation.beanvalidation.BeanValidationPostProcessor;

/**
 * @Author: Wuhao
 * @Date: Created in 2020-08-29 22:03
 * @Description: 用来对 bean 做数据校验
 * @Version: 1.0
 */
public class BeanValidation extends BeanValidationPostProcessor {

    @Override
    protected void doValidate(Object bean) {
        super.doValidate(bean);
    }
}
