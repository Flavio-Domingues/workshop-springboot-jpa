package com.cursospringboot.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cursospringboot.curso.entities.Category;
import com.cursospringboot.curso.repositories.CategoryRepository;
@Service

public class CategoryService {
	@Autowired
	private CategoryRepository CategoryRepository;
	
	public List<Category>findAll(){
		return CategoryRepository.findAll();
	}
public Category findById(Long id) {
	Optional <Category>obj = CategoryRepository.findById(id);
	return obj.get();
}
}
