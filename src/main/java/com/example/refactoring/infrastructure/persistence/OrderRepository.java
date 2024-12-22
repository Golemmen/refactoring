package com.example.refactoring.infrastructure.persistence;

import com.example.refactoring.domain.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
    // Здесь можно добавить дополнительные методы для работы с данными
}
