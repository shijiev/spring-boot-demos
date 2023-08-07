package io.shijiev.demo.controller;

import io.shijiev.demo.entity.User;
import io.shijiev.demo.mapper.UserMapper;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController {
    @Resource
    private UserMapper userMapper;

    @RequestMapping("/user/{id}")
    public User getUserById(@PathVariable Long id){

        return userMapper.selectById(id);

    }
}
