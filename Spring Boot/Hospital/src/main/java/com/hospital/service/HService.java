package com.hospital.service;

import java.util.List;

import com.hospital.model.Hospital;

public interface HService {
	public void addHosp(Hospital hos);
	public List<Hospital> getAllHospitals();
	public void upHosp(Hospital hos);
	public void delHosp(int id);
	public Hospital getHosp(int id);
}