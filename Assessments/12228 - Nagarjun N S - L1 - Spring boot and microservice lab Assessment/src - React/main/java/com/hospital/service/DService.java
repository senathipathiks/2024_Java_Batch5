package com.hospital.service;

import java.util.List;

import com.hospital.model.Doctor;

public interface DService{
	public void addDoc(Doctor doc);
	public void delDoc(int id);
	public void upDoc(Doctor doc);
	public List<Doctor> viewAllDoc();
	public Doctor getDoc(int id);
}
