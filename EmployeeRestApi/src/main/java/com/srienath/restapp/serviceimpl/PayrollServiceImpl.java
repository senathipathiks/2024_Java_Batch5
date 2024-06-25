package com.srienath.restapp.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srienath.restapp.model.Payroll;
import com.srienath.restapp.repository.PayrollRepo;
import com.srienath.restapp.service.PayrollService;

@Service
public class PayrollServiceImpl implements PayrollService{

	@Autowired
	PayrollRepo repo;
	
	public String addPayroll(Payroll pay) {
			repo.save(pay);
			return "Success";
	}
	
	public Payroll getPayroll(int id) {
		return repo.findById(id).get();
	}

	public List<Payroll> getAllPayrolls() {
		return repo.findAll();
	}

	public void updatePayroll(Payroll pay) {
		repo.save(pay);
	}
	
	public void deletePayroll(int id) {
		repo.deleteById(id);
	}
	
	public List<Integer> getAllId()
	{
		List<Integer> idList = repo.getIDList();
		return idList;
	}
}


