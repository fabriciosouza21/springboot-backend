package com.fsm.springboot.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fsm.springboot.entities.Client;
import com.fsm.springboot.services.ClientServices;

@RestController
@RequestMapping(value = "/clients")
public class ClientResources {

	@Autowired
	ClientServices services;

	@GetMapping
	public ResponseEntity<List<Client>> findAll() {
		List<Client> clients = services.findAll();
		return ResponseEntity.ok().body(clients);
	}

}
