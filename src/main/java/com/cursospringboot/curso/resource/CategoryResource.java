package com.cursospringboot.curso.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cursospringboot.curso.entities.Category;
import com.cursospringboot.curso.services.CategoryService;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {
	@Autowired
	private CategoryService CategoryService;

	@GetMapping
	public ResponseEntity<List<Category>> findAll() {
		List<Category> list = CategoryService.findAll();
		return ResponseEntity.ok().body(list);
	}
	@GetMapping(value = "/{id}")
	public ResponseEntity<Category>findById(@PathVariable Long id){
		Category obj = CategoryService.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
