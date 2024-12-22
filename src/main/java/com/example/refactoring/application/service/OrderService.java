package com.example.refactoring.application.service;

import com.example.refactoring.domain.model.Order;
import com.example.refactoring.infrastructure.persistence.OrderRepository;
import com.example.refactoring.infrastructure.notification.EmailNotification;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class OrderService {
    private final OrderRepository orderRepository;
    private final EmailNotification emailNotification;

    public OrderService(OrderRepository orderRepository, EmailNotification emailNotification) {
        this.orderRepository = orderRepository;
        this.emailNotification = emailNotification;
    }

    public void placeOrder(Order order) {
        if (order.getTotalAmount().compareTo(BigDecimal.valueOf(100)) > 0) {
            order.setStatus("Processed");
        } else {
            order.setStatus("Pending");
        }

        orderRepository.save(order);

        emailNotification.sendOrderConfirmation(order);
    }
}
