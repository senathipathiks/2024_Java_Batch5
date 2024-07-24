package com.velan.restapp.service;

import java.util.List;
import com.velan.restapp.model.Customer;

public interface CustomerService {

	public void addCustomer(Customer cus);
	public Customer getCustomer(int id);
	public List<Customer> getAllCustomers();
	public void updateCustomer(Customer cus);
	public void deleteCustomer(int id);	
}

