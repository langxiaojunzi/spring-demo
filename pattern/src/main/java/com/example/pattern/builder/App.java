package com.example.pattern.builder;

/**
 * <p>create at 2019/5/6</p>
 *
 * @author guzhan
 * @since 1.0.0
 */
public class App {

    public static void main(String[] args) {
        User user = User.builder()
                .name("guzhan")
                .password("123456")
                .age(22)
                .build();
        System.out.println(user);
    }
}
