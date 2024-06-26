package com.gopi.restapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gopi.restapp.model.PoliceStation;
import com.gopi.restapp.serviceimpl.PoliceStationServiceImpl;

@RestController
@RequestMapping("/policestation")
@CrossOrigin("http://localhost:3002")
public class PoliceStationController {

	@Autowired
	PoliceStationServiceImpl service;
	
	@PostMapping
	public String insertPoliceStation(@RequestBody PoliceStation policeStation) {
		String msgString = "";
		
		try {
			service.addPoliceStation(policeStation);
			msgString = "Insertion Success";
		} catch (Exception e) {
			msgString = "Insertion Failure";
		}
		return msgString;
	}
	
	@GetMapping("{id}")
	public PoliceStation getPoliceStationById(@PathVariable("id") int id) {
		return service.getPoliceStation(id);
	}
	@GetMapping("/all")
	public List<PoliceStation> getPoliceStation() {
		return service.getAllPoliceStations();
	}
	@PutMapping
	public String updatePoliceStation(@RequestBody PoliceStation policeStation) {
		String msgString = "";
		
		try {
			service.updatePoliceStation(policeStation);
			msgString = "Updation Success";
		} catch (Exception e) {
			msgString = "Updation Failure";
		}
		return msgString;
	}
	@GetMapping("/getPoliceStationid")
	public List<Integer> getPoliceStationIds() {
		return service.getPoliceStationIds();
	}
	@DeleteMapping("{id}")
	public String deletePoliceStationById(@PathVariable("id") int id) {
		String msgString = "";
		try {
			service.deletePoliceStation(id);
			msgString = "Deletion Success";
		} catch (Exception e) {
			msgString = "Deletion Failure";
		}
		return msgString;	
	}
}
