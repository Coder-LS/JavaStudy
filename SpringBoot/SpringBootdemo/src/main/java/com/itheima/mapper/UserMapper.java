package com.itheima.mapper;


import com.itheima.pojo.User;
import tk.mybatis.mapper.common.Mapper;

/**
 * @Description TODO
 * @Author W12777
 * @Date 2021/5/13 22:23
 * @Version 1.0
 **/

//@Mapper //或者，我们也可以不加注解，而是在启动类上添加扫描包注解(推荐)
public interface UserMapper extends Mapper<User> {
}
