package com.madhan.restapp.service;

import java.util.List;

import com.madhan.restapp.model.Payroll;

public interface PayrollService {
	public void addPayroll(Payroll proll) ;

	public List<Payroll> getAllPayroll();

	public void updatePayroll(Payroll proll);

	public void deletePayroll(int id);
	
//	List<Integer> getPayrollIds();
 

	public Payroll getPayroll(int id) ;
}
