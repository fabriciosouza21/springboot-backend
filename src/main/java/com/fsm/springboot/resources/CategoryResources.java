package com.fsm.springboot.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fsm.springboot.entities.Category;
import com.fsm.springboot.services.CategoryServices;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResources {
	@Autowired
	CategoryServices categoryServices;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findById(@PathVariable String id){
		Category category = categoryServices.findbyid(id);
		return ResponseEntity.ok().body(category);
		
	}
	@GetMapping
	public ResponseEntity<List<Category>> findAll(){
		List<Category> categories = categoryServices.findall();
		return ResponseEntity.ok().body(categories);
	}
	
}
