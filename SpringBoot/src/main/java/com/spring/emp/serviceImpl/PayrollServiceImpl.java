package com.spring.emp.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.emp.model.Payroll;
import com.spring.emp.repository.PayrollRepo;
import com.spring.emp.service.PayrollService;


@Service
public class PayrollServiceImpl implements PayrollService {

	@Autowired
	PayrollRepo repo;

	public void addPayroll(Payroll payroll) {

		repo.save(payroll);

	}

	public Payroll getPayroll(int id) {
		return repo.findById(id).get();

	}

	public List<Payroll> getAllPayrolls() {
		
		return repo.findAll();
	}

	public void updatePayroll(Payroll payroll) {
		repo.save(payroll);
		
	}

	public void deletePayroll(int id) {
		repo.deleteById(id);
		
	}



}
