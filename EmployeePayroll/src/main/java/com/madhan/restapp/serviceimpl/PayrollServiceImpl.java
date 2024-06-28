package com.madhan.restapp.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.madhan.restapp.model.Payroll;
import com.madhan.restapp.repository.PayrollRepo;

@Service
public class PayrollServiceImpl {

	@Autowired
	PayrollRepo repo;
	
	public void addPayroll(Payroll proll) {
		// TODO Auto-generated method stub
		repo.save(proll);
	}



	public List<Payroll> getAllPayroll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	public void updatePayroll(Payroll proll) {
		// TODO Auto-generated method stub
		repo.save(proll);

	}

	public void deletePayroll(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);

	}



	public Payroll getPayroll(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}



//	public List<Integer> getPayrollIds() {
//		// TODO Auto-generated method stub
//		return repo.fetchId();
//	}

}
