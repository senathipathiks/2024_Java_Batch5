package com.hospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.model.Register;
import com.hospital.repo.RegisterRepo;

@Service
public class RegSerImpl implements RegService{
	
	@Autowired
	RegisterRepo repo;

	@Override
	public void addReg(Register reg) {
		repo.save(reg);
	}

	@Override
	public List<Register> getAllReg() {
		List<Register> reglist = repo.findAll();
		return reglist;
	}

	@Override
	public void updateRegDetails(Register reg) {
		repo.save(reg);
	}

	@Override
	public void deleteRegisterDetail(int id) {
		repo.deleteById(id);
	}

	@Override
	public Register getReg(int id) {
		return repo.findById(id).get();
	}

	@Override
	public Register findUsername(String uname) {
		return repo.findByUsername(uname);
	}
	
	
}
