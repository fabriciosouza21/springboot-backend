package com.fsm.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fsm.springboot.entities.Client;

public interface ClientRepository extends JpaRepository<Client, String>{
	Client findByEmail(String email);

}
