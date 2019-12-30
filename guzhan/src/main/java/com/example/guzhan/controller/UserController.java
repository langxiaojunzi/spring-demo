package com.example.guzhan.controller;

import com.example.guzhan.model.User;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>created at 2019/11/29</p>
 *
 * @author guzhan
 * @since 1.0.0
 */
@RestController
public class UserController {

    @RequestMapping("/getUser")
    @Cacheable(value = "user-key")
    public User getUser() {
        User user = new User("aa@126.com", 1, 1);
        System.out.println("若下面没出现“无缓存的时候调用”字样且能打印出数据表示测试成功");
        return user;
    }
}
