package com.gopi.restapp.repository;

import java.util.List;

import com.gopi.restapp.model.PoliceStation;


public interface PoliceStationRepo {
	List<Integer> fetchId();
	PoliceStation findById(int id);
	List<PoliceStation> findAll();
	void update(PoliceStation policeStation);
	void save(PoliceStation policeStation);
	void deleteById(int id);
}
