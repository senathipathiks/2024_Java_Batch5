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

import com.hospital.model.Doctor;
import com.hospital.service.DSerimpl;

@RestController
@CrossOrigin("*")
@RequestMapping("/doctor")
public class DoctorController {
	
	@Autowired
	DSerimpl service;

	@PostMapping
	public String addDoc(@RequestBody Doctor doc) {
		String msg="";
		try {
			service.addDoc(doc);
			msg="Success";
		}
		catch(Exception e) {
			e.printStackTrace();
			msg="Failure";
		}
		return msg;
	}
	
	@GetMapping("{id}")
	public Doctor getDocbyid(@PathVariable("id") int id) {
		return service.getDoc(id);
	}
	
	@PutMapping
	public String upDocbyid(@RequestBody Doctor doc) {
		String msg="";
		try {
			service.upDoc(doc);
			msg="Success";
		}
		catch(Exception e) {
			e.printStackTrace();
			msg="Failure";
		}
		return msg;
	}
	
	@GetMapping("/all")
	public List<Doctor> getAllDoc(){
		return service.viewAllDoc();
	}
	
	@DeleteMapping("{id}")
	public String delDoc(@PathVariable("id") int id) {
		String msg="";
		try {
			service.delDoc(id);
			msg="Success";
		}
		catch(Exception e) {
			e.printStackTrace();
			msg="Failure";
		}
		return msg;
	}
}