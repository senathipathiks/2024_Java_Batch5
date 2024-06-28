package com.gana.backend.service;

import java.util.List;

import com.gana.backend.model.PayRoll;

public interface PayRollService {
	
public void addPayRoll(PayRoll payroll);
	
	public PayRoll getPayRoll(int payrollid);
	
	public List<PayRoll> getAllPayRolls();
	
	public void updatePayRoll(PayRoll payroll);
	
	public void deletePayRoll(int payrollid);
	
	

}
