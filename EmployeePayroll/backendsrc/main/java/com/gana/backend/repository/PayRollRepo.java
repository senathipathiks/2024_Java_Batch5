package com.gana.backend.repository;

import java.util.List;


import com.gana.backend.model.PayRoll;


public interface PayRollRepo {
	
	public void save(PayRoll payroll);

	public PayRoll findById(int payrollid) ;

	public List<PayRoll> findAll();


	public void update(PayRoll payroll);

	public void deleteById(int id);
	

}