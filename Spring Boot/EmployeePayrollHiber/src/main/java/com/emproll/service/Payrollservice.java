package com.emproll.service;

import java.util.List;

import com.emproll.model.Payroll;

public interface Payrollservice {
	public void addPay(Payroll roll);
	public Payroll getPay(int id);
	public void delPay(int id);
	public List<Payroll> viewAllPay();
	public void upPay(Payroll pay);
}
