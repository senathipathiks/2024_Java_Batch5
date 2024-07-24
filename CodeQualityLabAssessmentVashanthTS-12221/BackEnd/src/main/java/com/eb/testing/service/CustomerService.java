package com.eb.testing.service;

import java.util.List;

import com.eb.testing.model.Customer;



public interface CustomerService {


	public void adduser(Customer customer);
	
	public List<Customer> getall();
	
	public void updatecustomer(Customer customer);
	
	public void deletecustomer(int cid);
	
}
