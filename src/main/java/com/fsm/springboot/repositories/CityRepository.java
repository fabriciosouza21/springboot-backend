package com.fsm.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fsm.springboot.entities.City;

public interface CityRepository extends JpaRepository<City, String>{

	City findByName(String name);
}
