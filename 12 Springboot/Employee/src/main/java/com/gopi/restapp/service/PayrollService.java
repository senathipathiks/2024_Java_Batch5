package com.gopi.restapp.service;

import java.util.List;

import com.gopi.restapp.model.Payroll;

public interface PayrollService {
	Payroll getPayroll(int id);
	List<Payroll> getAllPayrolls();
	void updatePayroll(Payroll payroll);
	List<Integer> getPayrollIds();
	void addPayroll(Payroll payroll);
	void deletePayroll (int id);
}
