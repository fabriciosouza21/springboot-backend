package com.fsm.springboot.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fsm.springboot.entities.Product;
import com.fsm.springboot.services.ProductServices;

@RestController
@RequestMapping(value = "/products")
public class ProductResources {
	@Autowired
	ProductServices productServices;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> findById(@PathVariable String id){
		Product product = productServices.findbyid(id);
		return ResponseEntity.ok().body(product);
		
	}
	@GetMapping
	public ResponseEntity<List<Product>> findAll(){
		List<Product> products = productServices.findall();
		return ResponseEntity.ok().body(products);
	}
	
}
