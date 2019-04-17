package com.example.demo.service;

import com.example.demo.pojo.Order;

/**
 * <p>create at 2019/4/17</p>
 *
 * @author guzhan
 * @since 1.0.0
 */
public interface OrderService {
    Order createOrder(String username, String product);

    Order queryOrder(String username);
}
