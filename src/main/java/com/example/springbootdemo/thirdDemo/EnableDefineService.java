package com.example.springbootdemo.thirdDemo;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import({CacheImportSelector.class,LoggerDefinitionRegistrar.class})
public @interface EnableDefineService {
    Class<?>[] exclude() default {};
}
