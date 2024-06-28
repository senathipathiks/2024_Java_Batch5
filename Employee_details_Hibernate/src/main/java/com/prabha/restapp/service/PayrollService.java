package com.prabha.restapp.service;

import java.util.List;

import com.prabha.restapp.model.Payroll;

public interface PayrollService {
	public void addPayroll(Payroll payroll);

	public Payroll getPayroll(int id);

	public List<Payroll> getAllPayrolls();

	public void updatePayroll(Payroll payroll);

	public void deletePayroll(int id);
}
