package com.vickee.restapp.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vickee.restapp.model.Payroll;
import com.vickee.restapp.repository.PayrollRepo;
import com.vickee.restapp.service.PayrollService;

@Service
public class PayrollServiceImpl implements PayrollService {
	
	@Autowired
	PayrollRepo repo;
	
	@Override
	public String addPayroll(Payroll payroll) {
		if(payroll!=null) {
		repo.save(payroll);
		return "success";
		}
		else {
			return "failure";
		}
		
	}

	@Override
	public Payroll getPayroll(int pid) {
		Optional<Payroll> payOptional = repo.findById(pid);
		return payOptional.orElse(null);
		}

	@Override
	public List<Payroll> getAllPayrolls() {
		return repo.findAll();
	}

	@Override
	public String updatePayroll(Payroll payroll) {
		if(payroll!=null) {
			repo.save(payroll);
			return "success";
		}
		else {
			return "failure";
		}
	}

	@Override
	public String deletePayroll(int pid) {
		Optional<Payroll> payroll = repo.findById(pid);
		if(payroll.isPresent()) {
			repo.deleteById(pid);
			return "success";
		}
		else {
			return "failure";
		}
	}

	@Override
	public List<Integer> getAllPids() {
		// TODO Auto-generated method stub
		return repo.fetchAllPids();
		
	}

}
