package com.keerthana.demo.Service;

import java.util.List;


import com.keerthana.demo.Model.Payroll;

public interface PayrollService {
	public Payroll getPayroll(int id);
	public List<Payroll> getAllPayroll();
	public void updatePayroll(Payroll pay);
	public void deletePayroll (int id);
}
