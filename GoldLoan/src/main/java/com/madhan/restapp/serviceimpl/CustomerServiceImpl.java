package com.madhan.restapp.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.madhan.restapp.model.Customer;
import com.madhan.restapp.repository.CustomerRepo;

@Service
public class CustomerServiceImpl {

	@Autowired
	CustomerRepo repo;
	public void addCustomer(Customer cust) {
		repo.save(cust);
	}

	public Customer getCustomer(int id) {
		return repo.findById(id).orElse(null);
	}

	public List<Customer> getAllCustomer() {
		return repo.findAll();
	}

	public void updateCustomer(Customer cust) {
		repo.save(cust);
	}

	public void deleteCustomer(int id) {
		repo.deleteById(id);
	}

}
