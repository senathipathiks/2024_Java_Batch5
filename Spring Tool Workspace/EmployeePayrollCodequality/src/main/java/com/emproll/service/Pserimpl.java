package com.emproll.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.emproll.model.Payroll;
import com.emproll.repo.Payrollrepo;

@Service
public class Pserimpl implements Payrollservice{

	public Pserimpl(Payrollrepo repo) {
		super();
		this.repo = repo;
	}

	Payrollrepo repo;

	@Override
	public void addPay(Payroll roll) {
		repo.save(roll);
	}

	@Override
	public Optional<Payroll> getPay(int id) {
		return repo.findById(id);
	}

	@Override
	public void delPay(int id) {
		repo.deleteById(id);
	}

	@Override
	public List<Payroll> viewAllPay() {
		return repo.findAll();
	}

	@Override
	public void upPay(Payroll pay) {
		repo.save(pay);
	}

}
