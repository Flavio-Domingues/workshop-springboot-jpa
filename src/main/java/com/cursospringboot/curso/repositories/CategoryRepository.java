package com.cursospringboot.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursospringboot.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
