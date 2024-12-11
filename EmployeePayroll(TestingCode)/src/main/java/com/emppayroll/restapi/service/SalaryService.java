package com.emppayroll.restapi.service;

import java.util.List;

import com.emppayroll.restapi.model.Salary;

public interface SalaryService {
	
	public void addPayroll(Salary salary) ;
	
	public Salary getpayroll(int pid) ;
		
	public List<Salary> getall();
	
	public void updatepayroll(Salary salary);
	
	public void deletepayroll(int pid);
	
}
