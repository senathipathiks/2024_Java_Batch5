package com.vickee.restapp.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vickee.restapp.model.Payroll;
import com.vickee.restapp.repository.PayrollRepo;
import com.vickee.restapp.service.PayrollService;

@Service
public class PayrollServiceImpl implements PayrollService {
	
	@Autowired
	PayrollRepo repo;
	@Override
	public void addPayroll(Payroll payroll) {
		// TODO Auto-generated method stub
		repo.save(payroll);
		
	}

	@Override
	public Payroll getPayroll(int pid) {
		// TODO Auto-generated method stub
		return repo.findById(pid).get();
		}

	@Override
	public List<Payroll> getAllPayrolls() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void updatePayroll(Payroll payroll) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletePayroll(int pid) {
		// TODO Auto-generated method stub
		repo.deleteById(pid);
		
	}

	@Override
	public List<Integer> getAllPids() {
		// TODO Auto-generated method stub
		return repo.fetchAllPids();
		
	}

}
