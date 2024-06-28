package com.vickee.restapp.service;

import java.util.List;

import com.vickee.restapp.model.Payroll;

public interface PayrollService {
	

	public void addPayroll(Payroll payroll);
	public Payroll getPayroll(int pid);
	public List<Payroll> getAllPayrolls();
	public void updatePayroll(Payroll payroll);
	public void deletePayroll(int pid);
	public List<Integer> getAllPids();
}
