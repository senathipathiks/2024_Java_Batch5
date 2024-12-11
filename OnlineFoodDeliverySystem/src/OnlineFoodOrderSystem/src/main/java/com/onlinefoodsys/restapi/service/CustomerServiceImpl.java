package com.onlinefoodsys.restapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinefoodsys.restapi.model.Customer;
import com.onlinefoodsys.restapi.repository.CustomerRepo;

@Service
public class CustomerServiceImpl implements CustomerService{
@Autowired
CustomerRepo repo;
	
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
