package com.hp.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

  //@Configuration
  //@PropertySource("classpath:jdbc.properties")
public class jdbConfig {
    @Value("${jdbc.driverClassName}")
    private String  driverClassName;
    @Value("${jdbc.url}")
    private String  url;
    @Value("${jdbc.username}")
    private String  username;
    @Value("${jdbc.password}")
    private String  password;

    /**
     * 数据源
     * */
    //@Bean
     public DataSource getDataSource(){
     DruidDataSource dataSource = new DruidDataSource();
       dataSource.setDriverClassName(driverClassName);
       dataSource.setUrl(url);
       dataSource.setUsername(username);
       dataSource.setPassword(password);

       return  dataSource;
    }

}
