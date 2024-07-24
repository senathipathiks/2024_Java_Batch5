package com.madhan.restapp.service;

import java.util.List;

import com.madhan.restapp.model.Customer;

public interface CustomerService {

	public void addCustomer(Customer cust);

	public Customer getCustomer(int id);

	public List<Customer> getAllCustomer();

	public void updateCustomer(Customer cust);

	public void deleteCustomer(int id);
}
