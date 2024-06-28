package com.emproll.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.emproll.model.Employee;
import com.emproll.repo.Emprepo;

@Service
public class Eserimpl implements Empservice{

	public Eserimpl(Emprepo repo) {
		super();
		this.repo = repo;
	}

	Emprepo repo;
	
	@Override
	public void addemp(Employee emp) {
		repo.save(emp);
	}

	@Override
	public Optional<Employee> getEmp(int id) {
		return repo.findById(id);
	}

	@Override
	public void delEmp(int id) {
		repo.deleteById(id);
	}

	@Override
	public List<Employee> viewAllEmp() {
		return repo.findAll();
	}

	@Override
	public void upEmp(Employee emp) {
		repo.save(emp);
	}
	
}
