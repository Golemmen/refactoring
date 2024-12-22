package com.example.refactoring.domain.model;

import java.math.BigDecimal;

public class Order {
    private Long id;
    private BigDecimal totalAmount;
    private String status;

    // Getters and Setters

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
