package com.example.springbootdemo.jdbc;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
public class JdbcTemplateConfiguration {


    @Primary
    @Bean(name="db1JdbcTemplate")
    public JdbcTemplate jdbcTemplate1(){
        return new JdbcTemplate(db1DataSource());
    }

    @Bean(name="db2JdbcTemplate")
    public JdbcTemplate jdbcTemplate2(){
        return new JdbcTemplate(db2DataSource());
    }


    @Bean
    @Primary
    @ConfigurationProperties(prefix = "app.datasource.db2")
//    @ConfigurationProperties(prefix = "app.datasource.db2")
    public DataSourceProperties db2DataSourceProperties(){
        return new DataSourceProperties();
    }

    @Bean
    @ConfigurationProperties(prefix = "app.datasource.db1")
//    @ConfigurationProperties(prefix = "app.datasource.db1")
    public DataSourceProperties db1DataSourceProperties(){
        return new DataSourceProperties();
    }

    @Bean
    public DataSource db1DataSource(){
        return db1DataSourceProperties().initializeDataSourceBuilder().build();
    }

    @Bean
    public DataSource db2DataSource(){
        return db2DataSourceProperties().initializeDataSourceBuilder().build();
    }



}
