package com.emppayroll.restapi.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.emppayroll.restapi.model.Salary;
import com.emppayroll.restapi.repository.SalaryPayrollRepo;

@Service
public class SalaryPayrollServiceImpl implements SalaryService{

	 	 SalaryPayrollRepo repo;
	 
	 
	public SalaryPayrollServiceImpl(SalaryPayrollRepo repo) {
		super();
		this.repo = repo;
	}


	public void addPayroll(Salary salary) {
		
		repo.save(salary);
	}

	
	public Salary getpayroll(int pid) {
		
		return repo.findById(pid).get();
	}

	
	public List<Salary> getall() {
		
		return repo.findAll();
	}

	
	public void updatepayroll(Salary salary) {
		
		repo.save(salary);
	}

	
	public void deletepayroll(int pid) {
		
		repo.deleteById(pid);
	}

	
	
	
}
