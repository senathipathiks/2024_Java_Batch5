package com.employeepayroll.application.service;

import java.util.List;
import com.employeepayroll.application.model.Payroll;

public interface PayrollService {

	Payroll getPayrollById(int id);

	Payroll savePayroll(Payroll payroll);

	void deletePayroll(int id);

	Payroll updatePayroll(int id, Payroll updatedPayroll);

	List<Payroll> getAllPayrolls();

}
