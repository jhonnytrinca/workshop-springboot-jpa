package com.testesjava.curso_jpa_spring.repositories;

import com.testesjava.curso_jpa_spring.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
