package com.velan.restapp.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velan.restapp.model.Payroll;
import com.velan.restapp.repository.PayrollRepo;
import com.velan.restapp.service.PayrollService;

@Service
public class PayrollServiceImp implements PayrollService {

	@Autowired
	PayrollRepo repo;
	
	@Override
	public void addPayroll(Payroll pay) {
		
		repo.save(pay);

	}

	@Override
	public Payroll getPayroll(int id) {
		
		return repo.findById(id).get();
	
	}

	@Override
	public List<Payroll> getAllPayroll() {
		
		return repo.findAll();
	}

	@Override
	public void updatePayroll(Payroll pay) {
		
		repo.save(pay);
		
	}

	@Override
	public void deletePayroll(int id) {
		
		repo.deleteById(id);
		
	}
	
	@Override
	public List<Integer> getAllId()
	{
		List<Integer> idList = repo.getIdList();
		return idList;
	}

}
