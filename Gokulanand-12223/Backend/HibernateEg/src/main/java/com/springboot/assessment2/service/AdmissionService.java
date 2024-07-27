package com.springboot.assessment2.service;

import java.util.List;
import com.springboot.assessment2.model.Admission;

public interface AdmissionService 
{
	public void addAdmission(Admission admission);
	 
	public List<Admission> getallAdmission();

	public void updateAdmission(Admission admission);

	public void deleteAdmission(int aid);
	
	public Admission findAdmById(int aid);
}
