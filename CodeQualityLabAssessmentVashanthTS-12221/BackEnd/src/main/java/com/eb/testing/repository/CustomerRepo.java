package com.eb.testing.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eb.testing.model.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer>{

}
