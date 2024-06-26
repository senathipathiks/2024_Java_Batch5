package com.gopi.restapp.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.gopi.restapp.model.Payroll;

@Repository
public interface PayrollRepo{

	List<Integer> fetchId();
	Payroll findById(int id);
	List<Payroll> findAll();
	void update(Payroll payroll);
	void save(Payroll payroll);
	void deleteById(int id);
	
	
	
}
