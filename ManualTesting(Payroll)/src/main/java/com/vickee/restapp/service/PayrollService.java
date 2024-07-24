package com.vickee.restapp.service;

import java.util.List;

import com.vickee.restapp.model.Payroll;

public interface PayrollService {
	

	public String addPayroll(Payroll payroll);
	public Payroll getPayroll(int pid);
	public List<Payroll> getAllPayrolls();
	public String updatePayroll(Payroll payroll);
	public String deletePayroll(int pid);
	public List<Integer> getAllPids();
}
