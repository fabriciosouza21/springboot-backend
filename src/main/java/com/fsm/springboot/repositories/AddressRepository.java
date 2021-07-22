package com.fsm.springboot.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fsm.springboot.entities.Address;
import com.fsm.springboot.entities.City;

public interface AddressRepository extends JpaRepository<Address, String>{
	
	List<Address> findByCity(City city);
	
}
