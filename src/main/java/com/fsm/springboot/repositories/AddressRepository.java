package com.fsm.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fsm.springboot.entities.Address;

public interface AddressRepository extends JpaRepository<Address, String>{

}
