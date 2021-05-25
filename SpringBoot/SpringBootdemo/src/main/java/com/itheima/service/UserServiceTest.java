package com.itheima.service;

import com.itheima.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

/**
 * @Description TODO
 * @Author W12777
 * @Date 2021/5/14 15:52
 * @Version 1.0
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void queryById(){
        /**
         * 特别注意
         *
         * 使用 useJavaType=true 后，调用 ByPrimaryKey 类的方法时，
         * 需要按照实体中对应的类型来指定，例如主键类型为 Long 时，
         * 必须 mapper.selectByPrimaryKey(1L)。
         *
         * 不配置时，没有这个限制，可以使用 mapper.selectByPrimaryKey(1) 或
         * mapper.selectByPrimaryKey("1") 等类型。
         *
         */
        User user = userService.queryById(1L);
        System.out.println("user = " + user);
    }

    @Test
    public void saveUser() {
        User user = new User();
        user.setUserName("test");
        user.setName("test");
        user.setPassword("123456");
        user.setSex(1);
        user.setAge(20);
        user.setCreated(new Date());
        userService.saveUser(user);
    }
}
