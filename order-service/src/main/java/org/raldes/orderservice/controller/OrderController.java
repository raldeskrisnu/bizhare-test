package org.raldes.orderservice.controller;

import org.raldes.orderservice.response.OrderResponse;
import org.raldes.orderservice.service.OrderServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderServices orderServices;

    @GetMapping("/status/{orderId}")
    public OrderResponse getOrder(@PathVariable String orderId) {
        return orderServices.getOrder(orderId);
    }
}
