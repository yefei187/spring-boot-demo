package com.example.springbootdemo.thirdDemo;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.MethodMetadata;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

public class CacheImportSelector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {

        Map<String, Object> annotationAttributes
                = annotationMetadata.getAnnotationAttributes(EnableDefineService.class.getName());
        //annotationAttributes.get("");
//        Set<String> strings = annotationAttributes.keySet();
//        for (String string : strings) {
//            System.out.println(string);
//        }
//        annotationMetadata.
        String[] strs = new String[]{LoggerService.class.getName(),CacheService.class.getName()};
        Class<?>[] exclude = (Class<?>[])annotationAttributes.get("exclude");
        for (int i=0;i<exclude.length;i++) {
            if(exclude[i] == LoggerService.class){
                strs = new String[]{CacheService.class.getName()};
            }

        }


        return strs;
    }
}
