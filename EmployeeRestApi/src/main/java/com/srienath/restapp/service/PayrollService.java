package com.srienath.restapp.service;

import java.util.List;

import com.srienath.restapp.model.Payroll;

public interface PayrollService {
	public String addPayroll(Payroll pay);
	
	public Payroll getPayroll(int id);
	
	public List<Payroll> getAllPayrolls();
	
	public void updatePayroll(Payroll pay);
	
	public void deletePayroll(int id);
	
	List<Integer> getAllId();
}
