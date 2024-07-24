package com.supraja.restapp.service;

import java.util.List;

import com.supraja.restapp.model.Admission;

public interface AdmissionService {
	public void addAdmission(Admission admission);

	public Admission getAdmission(int id);

	public List<Admission> getAllAdmission();

	public void updateAdmission(Admission admission);

	public void deleteAdmission(int id);

}
