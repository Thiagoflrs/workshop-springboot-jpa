package com.coursejpa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coursejpa.course.entities.OrderItem;
import com.coursejpa.course.entities.pk.OrderItemPk;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPk> {
	
}
