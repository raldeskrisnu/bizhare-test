package org.raldes.orderservice.dao;

import org.raldes.orderservice.response.OrderResponse;
import org.springframework.stereotype.Component;


import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component
public class OrderDao {

    public OrderResponse getOrders(String orderId) {
        return mockOrdersData().get(orderId);
    }

    private Map<String, OrderResponse> mockOrdersData() {
        Map<String, OrderResponse> orderMap = new HashMap<>();
        orderMap.put("11111", new OrderResponse("11111", "panas 1", 1, 12, new Date(), "READY"));
        orderMap.put("22222", new OrderResponse("22222", "panas 2", 2, 33, new Date(), "PREPARING"));
        orderMap.put("33333", new OrderResponse("33333", "panas 3", 1, 11, new Date(), "DELIVERED"));
        return orderMap;
    }

}
