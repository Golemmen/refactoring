package com.example.refactoring.infrastructure.notification;

import com.example.refactoring.domain.model.Order;
import org.springframework.stereotype.Component;

@Component
public class EmailNotification {
    public void sendOrderConfirmation(Order order) {
        // Реализация отправки уведомления по email
        System.out.println("Order Confirmation sent for Order ID: " + order.getId());
    }
}
