package com.ani.emp.service;

import java.util.List;

import com.ani.emp.model.Payroll;


public interface PayrollService {

	public void addPayroll(Payroll Payroll);
	public Payroll getPayroll(int id);
	public List<Payroll> getAllPayrolls();
	public void updatePayroll(Payroll Payroll);
	public void deletePayroll(int id);
}
