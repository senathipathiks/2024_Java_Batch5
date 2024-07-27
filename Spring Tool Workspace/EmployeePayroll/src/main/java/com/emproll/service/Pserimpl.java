package com.emproll.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emproll.model.Payroll;
import com.emproll.repo.Payrollrepo;

@Service
public class Pserimpl implements Payrollservice{

	@Autowired
	Payrollrepo repo;

	@Override
	public void addPay(Payroll roll) {
		repo.save(roll);
	}

	@Override
	public Payroll getPay(int id) {
		return repo.findById(id).get();
	}

	@Override
	public void delPay(int id) {
		repo.deleteById(id);
	}

	@Override
	public List<Payroll> viewAllPay() {
		List<Payroll> paylist = repo.findAll();
		return paylist;
	}

	@Override
	public void upPay(Payroll pay) {
		repo.save(pay);
	}

}
