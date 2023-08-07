package io.shijiev.demo;

import io.shijiev.demo.mapper.UserMapper;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class SpringBootH2ApplicationTests {

    @Resource
    private UserMapper userMapper;

    @Test
    void contextLoads(){
        System.out.println(userMapper.selectById(3).getName());
        Assert.assertEquals("Ttt", userMapper.selectById(3).getName());
    }

}
