package com.hospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.model.Hospital;
import com.hospital.repo.Hospitalrepo;

@Service
public class HSerimpl implements HService{
	
	@Autowired
	Hospitalrepo repo;

	@Override
	public void addHosp(Hospital hos) {
		repo.save(hos);
	}

	@Override
	public List<Hospital> getAllHospitals() {
		List<Hospital> hoslist = repo.findAll();
		return hoslist;
	}

	@Override
	public void upHosp(Hospital hos) {
		repo.save(hos);
	}

	@Override
	public void delHosp(int id) {
		repo.deleteById(id);
	}

	@Override
	public Hospital getHosp(int id) {
		return repo.findById(id).get();
	}

}
