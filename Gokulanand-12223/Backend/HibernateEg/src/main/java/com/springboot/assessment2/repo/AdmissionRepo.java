package com.springboot.assessment2.repo;

import java.util.List;

import com.springboot.assessment2.model.Admission;

public interface AdmissionRepo
{

	public void save(Admission admission);

	public List<Admission> findAll();
	
	public void update(Admission admission);

	public void deleteById(int aid);
	
	public Admission findAdmission(int aid);

}
