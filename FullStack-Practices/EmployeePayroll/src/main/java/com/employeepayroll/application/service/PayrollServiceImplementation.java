package com.employeepayroll.application.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.employeepayroll.application.model.Payroll;
import com.employeepayroll.application.repository.PayrollRepository;

@Service
public class PayrollServiceImplementation implements PayrollService {

	private final PayrollRepository payrollRepository;

	public PayrollServiceImplementation(PayrollRepository payrollRepository) {
		this.payrollRepository = payrollRepository;
	}

	@Override
	public Payroll getPayrollById(int id) {
		return payrollRepository.findById(id).orElse(null);
	}

	@Override
	public Payroll savePayroll(Payroll payroll) {
		return payrollRepository.save(payroll);
	}

	@Override
	public void deletePayroll(int id) {
		payrollRepository.deleteById(id);
	}

	@Override
	public Payroll updatePayroll(int id, Payroll updatedPayroll) {
		Payroll existingPayroll = payrollRepository.findById(id).orElse(null);
		if (existingPayroll != null) {
			existingPayroll.setNetSalary(updatedPayroll.getNetSalary());
			return payrollRepository.save(existingPayroll);
		}
		return null;
	}

	@Override
	public List<Payroll> getAllPayrolls() {
		return payrollRepository.findAll();
	}
}
