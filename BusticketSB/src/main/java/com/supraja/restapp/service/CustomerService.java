package com.supraja.restapp.service;

import java.util.List;

import com.supraja.restapp.model.Customer;

public interface CustomerService {
	public void addCustomer(Customer customer);

	public Customer getCustomer(int id);

	public List<Customer> getAllCustomer();

	public void updateCustomer(Customer customer);

	public void deleteCustomer(int id);

}
