package com.emppayroll.restapi.service;

import java.util.List;

import com.emppayroll.restapi.model.EmpPay;


public interface PayrollService {

	
	public void addemp(EmpPay stud) ;
	
	public EmpPay getemp(int id) ;
		
	public List<EmpPay> getall();
	
	public void updateemp(EmpPay stud);
	
	public void deleteemp(int id);
	
}
