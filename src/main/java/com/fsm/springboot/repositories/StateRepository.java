package com.fsm.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fsm.springboot.entities.State;

public interface StateRepository extends JpaRepository<State, String>{
	
	State findByNome(String nome);
	
}
