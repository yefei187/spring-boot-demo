package com.example.springbootdemo;

import com.example.springbootdemo.jdbc.JdbcController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDemoApplicationTests {

    @Test
    public void contextLoads() {
    }

//    JdbcTemp

    @Autowired
    JdbcController jdbcController;
    @Test
    public void jdbcTest(){
        jdbcController.insert();
    }

    @Autowired
    JdbcTemplate  db1JdbcTemplate;
    @Test
    public void jdbcTest1(){
        db1JdbcTemplate.execute("insert into test (nums,name) values (10,'mic')");
    }
}
