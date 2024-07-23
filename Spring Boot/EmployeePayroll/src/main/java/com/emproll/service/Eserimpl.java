package com.emproll.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emproll.model.Employee;
import com.emproll.repo.Emprepo;

@Service
public class Eserimpl implements Empservice{

	@Autowired
	Emprepo repo;
	
	@Override
	public void addemp(Employee emp) {
		repo.save(emp);
	}

	@Override
	public Employee getEmp(int id) {
		return repo.findById(id).get();
	}

	@Override
	public void delEmp(int id) {
		repo.deleteById(id);
	}

	@Override
	public List<Employee> viewAllEmp() {
		List<Employee> emplist = repo.findAll();
		return emplist;
	}

	@Override
	public void upEmp(Employee emp) {
		repo.save(emp);
	}
	
}
