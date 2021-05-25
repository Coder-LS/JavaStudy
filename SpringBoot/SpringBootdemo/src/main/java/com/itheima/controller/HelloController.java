package com.itheima.controller;

import com.itheima.pojo.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

/**
 * @Description TODO
 * @Author W12777
 * @Date 2021/5/11 15:08
 * @Version 1.0
 *
 *
 * 1）监听的端口是8080
 * 2）SpringMVC的项目路径是：空
 * 3）/hello路径已经映射到了HelloController中的hello()方法
 *
 * http://localhost:8080/hello
 *
 * 在入门案例中，我们没有任何的配置，就可以实现一个SpringMVC的项目了，快速、高效！
 **/
@RestController
public class HelloController {


//    //可以在任意位置通过@Autowired注入DataSource
//    @Autowired
//    private DataSource dataSource;

//    @Value("${itcast.url}")
//    private String itcastUrl;

//    @Value("${itheima.url}")
//    private String itheimaUrl;

    /**
     * 异常:Injection of autowired dependencies failed; nested exception is java.lang.IllegalArgumentException
     * 此时配置文件默认的名称为:application.properties
     * 解决方法:
     * 将配置文件名改为:application.yml
     * 就可以正常启动.
     *
     * 后来又发现如果想让配置文件名称为application.properties
     * 则需要在配置文件中以:
     * xxx.yyy.name的格式来书写需要使用到的属性
     *
     *
     * @return
     */

//    @GetMapping("hello")
//    public String hello(){
//        System.out.println("dataSource = " + dataSource);
//        System.out.println("itcast.Url = " + itcastUrl);
//        System.out.println("itheima.Url = " + itheimaUrl);
//        return "hello, spring boot!";
//    }


    @Autowired
    private UserService userService;

    /**
     * 根据id获取用户
     * @param id 用户id
     * @return 用户
     *
     */
    @GetMapping("/user/{id}")
    public User queryById(@PathVariable Long id){
        return userService.queryById(id);
    }
}
