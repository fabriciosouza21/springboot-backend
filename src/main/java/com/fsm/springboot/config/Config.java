package com.fsm.springboot.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.fsm.springboot.entities.Address;
import com.fsm.springboot.entities.City;
import com.fsm.springboot.entities.Client;
import com.fsm.springboot.entities.State;
import com.fsm.springboot.repositories.AddressRepository;
import com.fsm.springboot.repositories.CityRepository;
import com.fsm.springboot.repositories.ClientRepository;
import com.fsm.springboot.repositories.StateRepository;

@Configuration
public class Config implements CommandLineRunner{
	@Autowired
	StateRepository stateRepository;
	
	@Autowired
	CityRepository cityRepository;
	
	@Autowired
	AddressRepository addressRepository;
	
	@Autowired
	ClientRepository clientRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		State para = new State(null, "amazonas");
		stateRepository.save(para);
		
		City manaus = new City(null, "manaus", para);
		cityRepository.save(manaus);
		
		Client joao = new Client(null, "joao", "joao@gmai.com", "1234579615");
		clientRepository.save(joao);
		
		Address address = new Address(null, "anjos", "156", "alameda silva", "paraiso", "123456", manaus,joao);
		
		
		addressRepository.save(address);
		
		
	}

}
