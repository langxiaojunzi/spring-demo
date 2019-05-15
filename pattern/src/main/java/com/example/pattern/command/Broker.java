package com.example.pattern.command;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>create at 2019/5/15</p>
 *
 * @author guzhan
 * @since 1.0.0
 */
public class Broker {
    private List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrders() {
        for (Order order : orderList) {
            order.execute();
        }
//        orderList.forEach(Order::execute);
        orderList.clear();
    }
}
