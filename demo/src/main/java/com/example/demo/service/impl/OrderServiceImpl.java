package com.example.demo.service.impl;

import com.example.demo.pojo.Order;
import com.example.demo.service.OrderService;

/**
 * <p>create at 2019/4/17</p>
 *
 * @author guzhan
 * @since 1.0.0
 */
public class OrderServiceImpl implements OrderService {
    @Override
    public Order createOrder(String username, String product) {
        Order order = new Order();
        order.setUsername(username);
        order.setProduct(product);
        return order;
    }

    @Override
    public Order queryOrder(String username) {
        Order order = new Order();
        order.setUsername("test");
        order.setProduct("test");
        return order;
    }
}
