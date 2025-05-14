package com.cursospringboot.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursospringboot.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
