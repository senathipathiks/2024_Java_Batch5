package com.emproll.service;

import java.util.List;
import java.util.Optional;

import com.emproll.model.Payroll;

public interface Payrollservice {
	public void addPay(Payroll roll);
	public Optional<Payroll> getPay(int id);
	public void delPay(int id);
	public List<Payroll> viewAllPay();
	public void upPay(Payroll pay);
}
