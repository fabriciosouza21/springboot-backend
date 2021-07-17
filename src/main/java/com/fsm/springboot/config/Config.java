package com.fsm.springboot.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.fsm.springboot.entities.State;
import com.fsm.springboot.repositories.StateRepository;

@Configuration
public class Config implements CommandLineRunner{
	@Autowired
	StateRepository stateRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		State para = new State(null, "para");
		stateRepository.save(para);
		
		
	}

}
