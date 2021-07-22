package com.fsm.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fsm.springboot.entities.PhoneNumber;

public interface PhoneNumberRepository extends JpaRepository<PhoneNumber, String>{

}
