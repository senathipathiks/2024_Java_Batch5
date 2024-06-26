package com.gopi.restapp.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gopi.restapp.model.PoliceStation;
import com.gopi.restapp.repository.PoliceStationRepo;
import com.gopi.restapp.service.PoliceStationService;

@Service
public class PoliceStationServiceImpl implements PoliceStationService {

	@Autowired
	PoliceStationRepo repo;
	
	@Override
	public PoliceStation getPoliceStation(int stationId) {
		return repo.findById(stationId);
	}

	@Override
	public List<PoliceStation> getAllPoliceStations() {
		
		return repo.findAll();
	}

	@Override
	public void updatePoliceStation(PoliceStation policeStation) {
		
		repo.update(policeStation);
		
	}

	@Override
	public List<Integer> getPoliceStationIds() {
		
		return repo.fetchId();
	}

	@Override
	public void addPoliceStation(PoliceStation policeStation) {
		
		repo.save(policeStation);
	}

	@Override
	public void deletePoliceStation(int id) {
		
		repo.deleteById(id);
	}
}
