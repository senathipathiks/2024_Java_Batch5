package com.subash.api.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subash.api.model.Employee;
import com.subash.api.model.Payroll;
import com.subash.api.ownrepo.PayrollOwnReoImpl;
import com.subash.api.ownrepo.PayrollOwnRep;
import com.subash.api.repository.EmployeeRepo;
import com.subash.api.repository.PayrollRepo;
import com.subash.api.service.PayrollService;

@Service
public class PayrollServiceImpl implements PayrollService {
	
	@Autowired
	PayrollRepo repo;
	
	@Autowired
	PayrollOwnRep ownrepo;
	
	public void addPayroll(Payroll payroll) {
		//repo.save(payroll);
		ownrepo.save(payroll);		
	}

	public Payroll getPayroll(int id) {
		
		//return repo.findById(id).get();
		return ownrepo.findById(id);
		
	}

	public List<Payroll> getAllPayrolls() {
		
		
		//return repo.findAll();
		return ownrepo.findAll();
	}

	public void updatePayroll(Payroll payroll) {
		
		//repo.save(payroll);
		ownrepo.update(payroll);
		
	}

	public void deletePayroll(int id) {
		
//		repo.deleteById(id);
		ownrepo.deleteById(id);
		
	}

	@Override
	public void addPayrolls(List<Payroll> payroll) {
		// TODO Auto-generated method stub
		
	}

	

}
