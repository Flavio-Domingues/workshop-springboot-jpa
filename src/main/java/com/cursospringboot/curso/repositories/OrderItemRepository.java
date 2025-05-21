package com.cursospringboot.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursospringboot.curso.entities.OrderItem;
import com.cursospringboot.curso.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
