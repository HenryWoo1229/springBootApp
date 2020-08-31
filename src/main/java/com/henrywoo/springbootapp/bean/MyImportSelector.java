package com.henrywoo.springbootapp.bean;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Author: Wuhao
 * @Date: Created in 2020-08-29 16:45
 * @Description: TODO
 * @Version: 1.0
 */
public class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{"com.henrywoo.springbootapp.bean.MyBean", "com.henrywoo.springbootapp.bean.Blue"};
    }
}
