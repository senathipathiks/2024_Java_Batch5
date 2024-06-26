package com.gopi.restapp.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gopi.restapp.model.Payroll;
import com.gopi.restapp.repository.PayrollRepo;
import com.gopi.restapp.service.PayrollService;

@Service
public class PayrollServiceImpl implements PayrollService {

	
	@Autowired
	PayrollRepo repo;
	
	@Override
	public Payroll getPayroll(int id) {
		Payroll payroll = repo.findById(id);
		return payroll;
	}

	@Override
	public List<Payroll> getAllPayrolls() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void updatePayroll(Payroll payroll) {
		// TODO Auto-generated method stub
		repo.update(payroll);
		
	}

	@Override
	public List<Integer> getPayrollIds() {
		// TODO Auto-generated method stub
		return repo.fetchId();
	}

	@Override
	public void addPayroll(Payroll payroll) {
		// TODO Auto-generated method stub
		repo.save(payroll);
	}

	@Override
	public void deletePayroll(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

}
