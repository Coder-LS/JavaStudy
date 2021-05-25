package com.itheima.config;

/**
 * @Description TODO
 * @Author W12777
 * @Date 2021/5/11 16:29
 * @Version 1.0
 **/

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import javax.sql.DataSource;


/**
 * @Configuration：声明一个类作为配置类，代替xml文件
 * @Bean：声明在方法上，将方法的返回值加入Bean容器，代替<bean>标签
 * @Value：属性注入
 * @PropertySource：指定外部属性文件，
 *
 * 解读：
 * @Configuration：声明我们JdbcConfig是一个配置类
 * @PropertySource：指定属性文件的路径是: classpath:jdbc.properties
 * @Value为属性注入值
 * @Bean将 dataSource()方法声明为一个注册Bean的方法，Spring会自动调用该方法，将方法的返回值 加入Spring容器中。
 *
 * 然后我们就可以在任意位置通过@Autowired注入DataSource了！
 */

//@Configuration
//@PropertySource("classpath:jdbc.properties")


/**
 * @Configuration
 * @EnableConfigurationProperties(JdbcProperties.class)
 * 通过@EnableConfigurationProperties(JdbcProperties.class)
 * 来声明要使用JdbcProperties这个类的 对象
 *
 * @Autowired注入
 * @Bean的方法参数注入
 */
@Configuration
public class JdbcConfig {

    /**
    @Value("${jdbc.url}")
    String url;
    @Value("${jdbc.driverClassName}")
    String driverClassName;
    @Value("${jdbc.username}")
    String username;
    @Value("${jdbc.password}")
    String password;

    @Bean
    public DataSource dataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driverClassName);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }
    */

    /**
    @Bean // 声明要注入的属性前缀，Spring Boot会自动把相关属性通过set方法注入到DataSource中
    @ConfigurationProperties(prefix = "jdbc")

     * 我们直接把@ConfigurationProperties(prefix = "jdbc")声明在需要使用的@Bean的方法上，
     * 然后Spring Boot就会自动调用这个Bean（此处是DataSource）的set方法，然后完成注入。
     * 使用的前提是：该类必须有对应属性的set方法！

    public DataSource dataSource() {
        return new DruidDataSource();
    }
     */
}
