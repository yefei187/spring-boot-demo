package com.example.springbootdemo;

import com.lyf.starter.FormatTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private FormatTemplate formatTemplate;
    @GetMapping("/hello")
    public String hello(){
        User user = new User("mic",22);

        return formatTemplate.doFormat(user);
    }
}
