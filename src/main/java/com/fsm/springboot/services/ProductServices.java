package com.fsm.springboot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fsm.springboot.entities.Product;
import com.fsm.springboot.repositories.ProductRepository;

@Service
public class ProductServices {
	@Autowired
	private ProductRepository productRepository;
	
	public Product findbyid(String id) {
		Optional<Product> product = productRepository.findById(id);
		return product.get() ;
	}
	public List<Product> findall(){
		
		return productRepository.findAll();
	}
	
}
