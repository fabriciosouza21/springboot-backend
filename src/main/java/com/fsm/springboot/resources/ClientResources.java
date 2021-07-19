package com.fsm.springboot.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

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
	@PostMapping
	public ResponseEntity<Client> save(@RequestBody Client client){
		client = services.save(client);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(client.getId()).toUri();
		return ResponseEntity.created(uri).body(client);
	}
	@GetMapping(value = "/{email}")
	public ResponseEntity<Client> findByEmail(@PathVariable String email){
		Client client = services.findByEmail(email);
		return ResponseEntity.ok().body(client);
	}

}
