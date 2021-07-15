package com.fsm.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fsm.springboot.entities.Product;

public interface ProductRepository extends JpaRepository<Product, String> {
	
}
