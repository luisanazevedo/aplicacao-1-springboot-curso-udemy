package com.luisa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luisa.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
