package com.example.demo.service.impl;

import com.example.demo.pojo.User;
import com.example.demo.service.UserService;

/**
 * <p>create at 2019/4/17</p>
 *
 * @author guzhan
 * @since 1.0.0
 */
public class UserServiceImpl implements UserService {
    @Override
    public User createUser(String firstName, String lastName, int age) {
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setAge(age);
        return user;
    }

    @Override
    public User queryUser() {
        User user = new User();
        user.setFirstName("test");
        user.setLastName("test");
        user.setAge(20);
        return user;
    }
}
