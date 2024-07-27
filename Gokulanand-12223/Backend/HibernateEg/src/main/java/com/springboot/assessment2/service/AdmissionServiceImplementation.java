package com.springboot.assessment2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.assessment2.model.Admission;
import com.springboot.assessment2.repo.AdmissionRepo;

@Service
public class AdmissionServiceImplementation implements AdmissionService
{

	@Autowired
	AdmissionRepo repo;
	
	public AdmissionServiceImplementation(AdmissionRepo repo) {
		super();
		this.repo = repo;
	}

	@Override
	public void addAdmission(Admission admission) 
	{
		repo.save(admission);
	}
	 
	@Override
	public List<Admission> getallAdmission() 
	{
	return repo.findAll();
	}
	 
	@Override
	public void updateAdmission(Admission admission) 
	{
	repo.update(admission);
	}
	 
	@Override
	public void deleteAdmission(int aid) 
	{	
	repo.deleteById(aid);
	}

	@Override
	public Admission findAdmById(int aid) 
	{
		return repo.findAdmission(aid);
	}
}
