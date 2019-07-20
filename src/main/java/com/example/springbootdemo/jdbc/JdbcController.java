package com.example.springbootdemo.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JdbcController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public void insert(){
        String sql = "insert into test (nums,name) values (10,'mic')";
        jdbcTemplate.execute(sql);
    }
}
