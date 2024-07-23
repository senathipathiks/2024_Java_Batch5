package com.hospital.controller;

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

import com.hospital.model.Hospital;
import com.hospital.service.HSerimpl;

@RestController
@RequestMapping("/hospital")
@CrossOrigin("*")
public class HospitalController {

	@Autowired
	HSerimpl service;
	
	@PostMapping
	public String addHos(@RequestBody Hospital hos) {
		String msg="";
		try {
			service.addHosp(hos);
			msg="Success";
		}
		catch(Exception e) {
			e.printStackTrace();
			msg="Failure";
		}
		return msg;
	}
	
	@GetMapping("{id}")
	public Hospital getHosp(@PathVariable("id") int id) {
		return service.getHosp(id);
	}
	
	@PutMapping
	public String upDocbyid(@RequestBody Hospital hos) {
		String msg="";
		try {
			service.upHosp(hos);
			msg="Success";
		}
		catch(Exception e) {
			e.printStackTrace();
			msg="Failure";
		}
		return msg;
	}
	
	@GetMapping("/all")
	public List<Hospital> getAllDoc(){
		return service.getAllHospitals();
	}
	
	@DeleteMapping("{id}")
	public String delDoc(@PathVariable("id") int id) {
		String msg="";
		try {
			service.delHosp(id);
			msg="Success";
		}
		catch(Exception e) {
			e.printStackTrace();
			msg="Failure";
		}
		return msg;
	}
}
