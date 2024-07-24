package com.aravind.micro.service;

import java.util.List;
import com.aravind.micro.model.Payroll;

public interface PayrollService  {
	public void addPayroll(Payroll pay);
	public Payroll getPayroll(int pid);
	public List<Payroll> getAllPayroll();
	public void updatePayroll(Payroll pay);
	public void deletePayroll(int pid);
	List<Integer> getAllId();
}
