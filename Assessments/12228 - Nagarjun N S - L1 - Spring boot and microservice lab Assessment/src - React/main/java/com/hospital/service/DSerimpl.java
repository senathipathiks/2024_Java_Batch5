package com.hospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.model.Doctor;
import com.hospital.repo.Doctorrepo;

@Service
public class DSerimpl implements DService{
	
	@Autowired
	Doctorrepo repo;

	@Override
	public void addDoc(Doctor doc) {
		repo.save(doc);
	}

	@Override
	public void delDoc(int id) {
		repo.deleteById(id);
	}

	@Override
	public void upDoc(Doctor doc) {
		repo.save(doc);
	}

	@Override
	public List<Doctor> viewAllDoc() {
		List<Doctor> doclist = repo.findAll();
		return doclist;
	}

	@Override
	public Doctor getDoc(int id) {
		return repo.findById(id).get();
	}

}
