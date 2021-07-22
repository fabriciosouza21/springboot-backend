package com.fsm.springboot.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.EntityResponse;

import com.fsm.springboot.entities.Address;
import com.fsm.springboot.entities.City;
import com.fsm.springboot.services.AddressServices;

@RestController
@RequestMapping("/address")
public class AddressResources {
	
	@Autowired
	AddressServices services;
	
	@GetMapping(value = "/{city}")
	public ResponseEntity<List<Address>> findByCity (@PathVariable String city) {
		List<Address> address;
		address = services.findByCity(city);
		return ResponseEntity.ok().body(address);
	}

}
