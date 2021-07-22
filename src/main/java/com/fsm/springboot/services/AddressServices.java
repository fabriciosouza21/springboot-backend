package com.fsm.springboot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fsm.springboot.entities.Address;
import com.fsm.springboot.entities.City;
import com.fsm.springboot.repositories.AddressRepository;
import com.fsm.springboot.repositories.CityRepository;


@Service
public class AddressServices {
	
	@Autowired
	CityRepository cityRepository;
	
	@Autowired
	AddressRepository addressRepository;
	
	public List<Address> findByCity(String city){
		City resultCity = cityRepository.findByName(city);
		return addressRepository.findByCity(resultCity);			
	}
}
