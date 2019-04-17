package com.example.demo.service;

import com.example.demo.pojo.User;

/**
 * <p>create at 2019/4/17</p>
 *
 * @author guzhan
 * @since 1.0.0
 */
public interface UserService {
    User createUser(String firstName, String lastName, int age);

    User queryUser();
}
