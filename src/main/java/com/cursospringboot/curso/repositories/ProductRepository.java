package com.cursospringboot.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursospringboot.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
