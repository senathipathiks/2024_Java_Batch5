package com.velan.restapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.velan.restapp.model.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer>{

}

