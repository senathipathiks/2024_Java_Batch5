package com.subash.api.service;

import java.util.List;

import com.subash.api.model.Employee;
import com.subash.api.model.Payroll;

public interface PayrollService {
	public void addPayroll(Payroll payroll);
	public void addPayrolls(List<Payroll> payroll);
	
	public Payroll getPayroll(int id);
	
	public List<Payroll> getAllPayrolls();
	
	public void updatePayroll(Payroll payroll);
	
	public void deletePayroll(int id);
}
