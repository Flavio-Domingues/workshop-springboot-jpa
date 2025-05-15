package com.cursospringboot.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cursospringboot.curso.entities.User;
import com.cursospringboot.curso.repositories.UserRepository;
@Service

public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	public List<User>findAll(){
		return userRepository.findAll();
	}
public User findById(Long id) {
	Optional <User>obj = userRepository.findById(id);
	return obj.get();
}
}
