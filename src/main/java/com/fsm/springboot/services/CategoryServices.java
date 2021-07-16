package com.fsm.springboot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fsm.springboot.entities.Category;
import com.fsm.springboot.repositories.CategoryRepository;

@Service
public class CategoryServices {
	@Autowired
	private CategoryRepository categoryRepository;
	
	public Category findbyid(String id) {
		Optional<Category> category = categoryRepository.findById(id);
		return category.get() ;
	}
	public List<Category> findall(){
		
		return categoryRepository.findAll();
	}
	
}
