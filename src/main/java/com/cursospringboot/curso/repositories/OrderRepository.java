package com.cursospringboot.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursospringboot.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
