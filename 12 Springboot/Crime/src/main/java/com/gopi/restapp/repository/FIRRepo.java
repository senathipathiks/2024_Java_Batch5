package com.gopi.restapp.repository;

import java.util.List;

import com.gopi.restapp.model.FIR;

public interface FIRRepo {
	public void save(FIR fir);
	FIR findById(int id);
	List<FIR> findAll();
	void update(FIR fir);
	void deleteById(int id);
}
