package com.velan.restapp.serviceimp;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.velan.restapp.model.Customer;
import com.velan.restapp.repository.CustomerRepo;
import com.velan.restapp.service.CustomerService;

@Service
public class CustomerServiceImp implements CustomerService {

	CustomerRepo repo;

	public CustomerServiceImp(CustomerRepo repo) {
		this.repo = repo;
	}

	@Override
	public void addCustomer(Customer cus) {	
		repo.save(cus);
	}

	@Override
	public Customer getCustomer(int id) {
	    Optional<Customer> customerOptional = repo.findById(id);
	    return customerOptional.orElse(null);
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

