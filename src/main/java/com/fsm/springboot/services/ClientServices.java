package com.fsm.springboot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.fsm.springboot.entities.Client;
import com.fsm.springboot.repositories.ClientRepository;
import com.fsm.springboot.services.exception.DatabaseException;
import com.fsm.springboot.services.exception.ResourceNotFoundException;

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
	
	public Client findByEmail(String email) {
		Client client = repository.findByEmail(email);
		if (client != null) {
			return client;
		}
		else {
			throw new ResourceNotFoundException();
		}
	}
	
	public void deleteById(String id) {
		try {
			repository.deleteById(id);
		} catch (DataIntegrityViolationException e) {
			throw new DatabaseException("erro database "+e.getMessage());
		}catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException();
		}
		
	}
	
	public void update(Client clientModify) {
		try {
			Optional<Client> clientSource = repository.findById(clientModify.getId());
			updateData(clientModify, clientSource.get());
			repository.save(clientSource.get());
		}
		catch(RuntimeException e){
			e.printStackTrace();
		}
	}

	private void updateData(Client clientModify,Client clientSource) {
		clientSource.setCpfOuCnpj(clientModify.getCpfOuCnpj());
		clientSource.setEmail(clientModify.getEmail());
		clientSource.setName(clientModify.getName());
		
	}
}
