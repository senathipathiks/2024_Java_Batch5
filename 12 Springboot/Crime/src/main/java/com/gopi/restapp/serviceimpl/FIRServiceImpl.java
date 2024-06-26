package com.gopi.restapp.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gopi.restapp.model.FIR;
import com.gopi.restapp.repository.FIRRepo;
import com.gopi.restapp.service.FIRService;

@Service
public class FIRServiceImpl implements FIRService {

	@Autowired
	FIRRepo repo;
	
	@Override
	public void addFIR(FIR fir) {
		repo.save(fir);
	}

	@Override
	public FIR getFIR(int id) {
		
		return repo.findById(id);
	}

	@Override
	public List<FIR> getAllFIRs() {
		return repo.findAll();
	}

	@Override
	public void updateFIR(FIR fir) {
		repo.update(fir);
		
	}

	@Override
	public void deleteFIR(int id) {
		
		repo.deleteById(id);
	}
}
