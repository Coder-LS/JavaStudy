package com.itheima.service;

import com.itheima.mapper.UserMapper;
import com.itheima.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Description TODO
 * @Author W12777
 * @Date 2021/5/13 21:59
 * @Version 1.0
 **/
@Service
public class UserService {

    @Autowired(required = false)
    private UserMapper userMapper;

    public User queryById(Long id){
        //根据id查询
//         return new User();
        //根据id查询
         return userMapper.selectByPrimaryKey(id);
    }
    @Transactional
    public void saveUser(User user){
        System.out.println("新增用户...");
        userMapper.insertSelective(user);
    }
}
