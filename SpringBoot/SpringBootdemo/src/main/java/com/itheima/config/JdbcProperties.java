package com.itheima.config;

/**
 * @Description TODO
 * @Author W12777
 * @Date 2021/5/11 16:43
 * @Version 1.0
 **/


import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

/**
 * @Value注解只能注入基本类型值。
 */

//在类上通过@ConfigurationProperties注解声明当前类为属性读取类
//prefix="jdbc"读取属性文件中，前缀为jdbc的值
//在类上定义各个属性，名称必须与属性文件中jdbc.后面部分一致
//需要注意的是，这里我们并没有指定属性文件的地址，所以我们需要把jdbc.properties名称改为application.properties，这是Spring Boot默认读取的属性文件名
//@ConfigurationProperties(prefix = "jdbc")


/**
 * 然后要使用配置的话；可以通过以下方式注入JdbcProperties：
 * @Autowired注入
 * @Autowired
 * private JdbcProperties prop;
 *
 * 构造函数注入
 * private JdbcProperties prop;
 * public JdbcConfig(Jdbcproperties prop){ this.prop = prop;}
 *
 * 声明有@Bean的方法参数注入
 * @Bean public Datasource dataSource(JdbcProperties prop){ // ...}
 *
 */

public class JdbcProperties {


    private String url;
    private String driverClassName;
    private String username;
    private String password;


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
