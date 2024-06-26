package com.gopi.restapp.service;

import java.util.List;

import com.gopi.restapp.model.PoliceStation;


public interface PoliceStationService {
	PoliceStation getPoliceStation(int id);
	List<PoliceStation> getAllPoliceStations();
	void updatePoliceStation(PoliceStation policeStation);
	List<Integer> getPoliceStationIds();
	void addPoliceStation(PoliceStation policeStation);
	void deletePoliceStation (int id);
}
