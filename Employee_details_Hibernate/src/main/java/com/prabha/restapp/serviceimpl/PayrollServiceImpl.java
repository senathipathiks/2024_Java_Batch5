package com.prabha.restapp.serviceimpl;

import java.util.List;
import org.springframework.stereotype.Service;
import com.prabha.restapp.model.Payroll;
import com.prabha.restapp.repository.PayRollRepo;
import com.prabha.restapp.service.PayrollService;

@Service
public class PayrollServiceImpl implements PayrollService {

	PayRollRepo repo;

	public PayrollServiceImpl(PayRollRepo repo) {
		super();
		this.repo = repo;
	}

	public void addPayroll(Payroll payroll) {
		// TODO Auto-generated method stub
		repo.save(payroll);

	}

	public Payroll getPayroll(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}

	public List<Payroll> getAllPayrolls() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	public void updatePayroll(Payroll payroll) {
		repo.save(payroll);

	}

	public void deletePayroll(int id) {
		repo.deleteById(id);

	}

}
