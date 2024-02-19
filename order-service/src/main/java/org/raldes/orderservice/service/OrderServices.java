package org.raldes.orderservice.service;

import org.raldes.orderservice.dao.OrderDao;
import org.raldes.orderservice.response.OrderResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServices {

    @Autowired
    private OrderDao orderDao;

    public OrderResponse getOrder(String orderId) {
        return orderDao.getOrders(orderId);
    }
}
