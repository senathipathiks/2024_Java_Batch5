package com.gopi.restapp.service;

import java.util.List;

import com.gopi.restapp.model.FIR;


public interface FIRService {
	public void addFIR(FIR fir);
	FIR getFIR(int id);
	List<FIR> getAllFIRs();
	void updateFIR(FIR fir);
	void deleteFIR(int id);
}
