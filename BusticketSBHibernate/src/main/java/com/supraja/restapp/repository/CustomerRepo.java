package com.supraja.restapp.repository;


import java.util.List;

import org.springframework.stereotype.Repository;

import com.supraja.restapp.model.Customer;

@Repository
public interface CustomerRepo {
	public List<Integer> getIDList();

	void save(Customer customer);
	
    List<Customer> findAll();
	
	void deleteById(int id);
	
	Customer findById(int id);
}
