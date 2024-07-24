package com.eb.testing.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.eb.testing.model.Customer;
import com.eb.testing.repository.CustomerRepo;

@Service
public class CustomerServiceImpl implements CustomerService {

	CustomerRepo repo;
	
	public CustomerServiceImpl(CustomerRepo repo) {
		super();
		this.repo = repo;
	}

	public void adduser(Customer customer) {
		
		repo.save(customer);
	}

	public List<Customer> getall() {
		
		return repo.findAll();
	}


    public Optional<Customer> getuser(int cid) {
		
		return    repo.findById(cid);
	}

	
	
	public void updatecustomer(Customer customer) {
		
		repo.save(customer);
	}

	
	public void deletecustomer(int cid) {
		
		repo.deleteById(cid);
	}

}
