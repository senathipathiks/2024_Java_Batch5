package com.prabha.restapp.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prabha.restapp.model.Payroll;
import com.prabha.restapp.repository.PayRollRepo;





@Service
public class PayrollServiceImpl {
	@Autowired
PayRollRepo repo;
	
	public void addPayroll(Payroll payroll) {
		// TODO Auto-generated method stub
		repo.save(payroll);

	}

	public Payroll getPayroll(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
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
