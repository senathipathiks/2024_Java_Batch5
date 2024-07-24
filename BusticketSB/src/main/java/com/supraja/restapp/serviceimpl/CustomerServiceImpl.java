package com.supraja.restapp.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.supraja.restapp.model.Customer;
import com.supraja.restapp.repository.CustomerRepo;
import com.supraja.restapp.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	public CustomerServiceImpl(CustomerRepo repo) {
		super();
		this.repo = repo;
	}

	CustomerRepo repo;

	@Override
	public void addCustomer(Customer cust) {
		repo.save(cust);

	}

	@Override
	public Customer getCustomer(int id) {
	    Optional<Customer> customerOptional = repo.findById(id);
	    if (customerOptional.isPresent()) {
	        return customerOptional.get();
	    } else {
	        
	       return new Customer(); 
	    }
	}


	@Override
	public List<Customer> getAllCustomer() {
		return repo.findAll();
	}

	@Override
	public void updateCustomer(Customer cust) {
		repo.save(cust);
	}

	@Override
	public void deleteCustomer(int id) {
		repo.deleteById(id);
	}
}
