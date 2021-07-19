package com.fsm.springboot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fsm.springboot.entities.Client;
import com.fsm.springboot.repositories.ClientRepository;

@Service
public class ClientServices {
	
	@Autowired
	ClientRepository repository;
	
	public List<Client> findAll(){
		return repository.findAll();
	}
	
	public Client save(Client client) {
		return repository.save(client);
	}
	
}
