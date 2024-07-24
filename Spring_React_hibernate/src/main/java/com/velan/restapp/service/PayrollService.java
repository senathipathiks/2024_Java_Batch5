package com.velan.restapp.service;

import java.util.List;

import com.velan.restapp.model.Employee;
import com.velan.restapp.model.Payroll;

public interface PayrollService {

	public void addPayroll(Payroll pay);
	public Payroll getPayroll(int id);
	public List<Payroll> getAllPayroll();
	public void updatePayroll(Payroll pay);
	public void deletePayroll(int id);

}
