package com.onlinefoodsys.restapi.service;

import java.util.List;

import com.onlinefoodsys.restapi.model.Customer;

public interface CustomerService {

	
	public void adduser(Customer customer);
	
	public List<Customer> getall();
	
	public void updatecustomer(Customer customer);
	
	public void deletecustomer(int cid);
}
