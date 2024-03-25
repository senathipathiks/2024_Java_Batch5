package com;

import java.util.*;

public class DoctorManagement {
	
	// Hash Map - Data Structure
	HashMap<Integer,Doctor> hm = new HashMap<>();
	
	//Add doctor
	public boolean addDoctor(int doctorId, String firstName, String lastName, String email, long mobileNumber) {
		Doctor d = new Doctor(doctorId, firstName, lastName, email, mobileNumber);
		hm.put(doctorId,d);
		return true; 
	}
	
	//Update doctor
	public boolean updateDoctor(int doctorId, String firstName, String lastName, String email, long mobileNumber) {
		Doctor d = new Doctor(doctorId, firstName, lastName, email, mobileNumber);
		if(hm.containsKey(d.getDoctorId())) {
			hm.put(d.getDoctorId(), d);
			return true;
		} else return false;
	}
	
	//Delete doctor
	public boolean deleteDoctor(int doctorId) {
		if(hm.remove(doctorId) != null) {
			return true;
		}else return false;
		
	}
	
	//Find doctor
	public Doctor findDoctor(int doctorId) {
		Doctor d = null; 
		if (hm.containsKey(doctorId)) {
			d = hm.get(doctorId);			
		}
		return d;
	}
	
	//Display doctor
	public void viewAllDoctor() {
		Iterator <Integer> it = hm.keySet().iterator();
		while(it.hasNext()) {
			int key = (int)it.next(); 
			hm.get(key).display();
		}
	}
	
}
