package com.prabha.restapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prabha.restapp.model.Payroll;

public interface PayRollRepo {
	
	public void save(Payroll payroll);

	public Payroll findById(int id) ;

	public List<Payroll> findAll();


	public void update(Payroll payroll);

	public void deleteById(int id);
}
