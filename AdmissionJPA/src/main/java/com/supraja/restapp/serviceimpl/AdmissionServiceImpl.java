package com.supraja.restapp.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.supraja.restapp.model.Admission;

import com.supraja.restapp.repository.AdmissionRepo;

import com.supraja.restapp.service.AdmissionService;

@Service
public class AdmissionServiceImpl implements AdmissionService {

	@Autowired
	AdmissionRepo repo;

	@Override
	public void addAdmission(Admission admi) {
		// TODO Auto-generated method stub

		repo.save(admi);
	}

	@Override
	public Admission getAdmission(int id) {

		return repo.findById(id).get();
	}

	@Override
	public List<Admission> getAllAdmission() {
		return repo.findAll();
	}

	@Override
	public void updateAdmission(Admission admi) {
		repo.save(admi);
	}

	@Override
	public void deleteAdmission(int id) {
		repo.deleteById(id);
	}

	public List<Integer> getAllId() {
		List<Integer> idList = repo.getIDList();
		return idList;
	}
}
