package com.springboot.assessment2.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.assessment2.model.Admission;
import com.springboot.assessment2.service.AdmissionServiceImplementation;

@RestController
@RequestMapping("/admission")
@CrossOrigin("*")
public class AdmissionController 
{

	AdmissionServiceImplementation service;
	
	public AdmissionController(AdmissionServiceImplementation service) {
		super();
		this.service = service;
	}

	@PostMapping
	public  String insertAdmission(@RequestBody Admission admission)
	{
	String msg = "";
	try {
	service.addAdmission(admission);
	msg = "Successfully Added";
	}
	catch (Exception e) {
	msg = "Failed to Add";
	}
	return msg;
	}

	@GetMapping("/all")
	public List<Admission> readAllAdmission()
	{
	return service.getallAdmission();
	}

	@PutMapping
	public  String updateAdmission(@RequestBody Admission admission)
	{
	String msg = "";
	try {
	service.updateAdmission(admission);
	msg = "Successfully Updated";
	}
	catch (Exception e) {
	msg = "Failed to Update";
	}
	return msg;
	}

	@DeleteMapping("{aid}")
	public String deleteAdmissionbyId(@PathVariable("aid") int aid)
	{
	String msg = "";
	try {
	service.deleteAdmission(aid);
	msg = "Successfully Deleted";
	}
	catch (Exception e) {
	msg = "Failed to Delete";
	}
	return msg;	
	}
}
