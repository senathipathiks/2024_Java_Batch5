package com.velan.restapp.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velan.restapp.model.Customer;
import com.velan.restapp.repository.CustomerRepo;
import com.velan.restapp.service.CustomerService;

@Service
public class CustomerServiceImp implements CustomerService {

	@Autowired
	CustomerRepo repo;
	
	@Override
	public void addCustomer(Customer cus) {
		
		repo.save(cus);

	}

	@Override
	public Customer getCustomer(int id) {
		
		return repo.findById(id).get();
	
	}

	@Override
	public List<Customer> getAllCustomers() {
		
		return repo.findAll();
	}

	@Override
	public void updateCustomer(Customer cus) {
		
		repo.save(cus);
		
	}

	@Override
	public void deleteCustomer(int id) {
		
		repo.deleteById(id);
		
	}

}

