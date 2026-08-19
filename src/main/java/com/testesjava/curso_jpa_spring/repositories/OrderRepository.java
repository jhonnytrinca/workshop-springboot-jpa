package com.testesjava.curso_jpa_spring.repositories;

import com.testesjava.curso_jpa_spring.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
