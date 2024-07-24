package com.emppayroll.restapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emppayroll.restapi.model.EmpPay;

import com.emppayroll.restapi.repository.EmpPayRepo;

@Service
public class EmpPayrollService implements PayrollService {

	
	
	 	 EmpPayRepo repo;
	 
	public EmpPayrollService(EmpPayRepo repo) {
		super();
		this.repo = repo;
	}


	public void addemp(EmpPay emp) {
		repo.save(emp);
	
	}

	
	public EmpPay getemp(int id) {
		
		return repo.findById(id).get();
	
	}


	public List<EmpPay> getall() {
		
		return repo.findAll();
	}

	public void updateemp(EmpPay emp) {
		repo.save(emp);
		
	}
	

	public void deleteemp(int id) {
		repo.deleteById(id);
	}
	
	 
}
