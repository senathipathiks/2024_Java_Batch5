package com.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.model.Register;
import com.hospital.service.RegSerImpl;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@CrossOrigin("*")
@RequestMapping("/register")
public class RegisterController {
	
	@Autowired
	RegSerImpl service;
	
	@PostMapping
	public String addReg(@RequestBody Register reg) {
		String msg = "";
		try {
			service.addReg(reg);
			msg = "Success";
		}
		catch(Exception e) {
			msg = "Failure";
		}
		return msg;
	}
	
	@GetMapping("/all")
	public List<Register> getAllReg(){
		return service.getAllReg();
	}
	
//	@GetMapping("{id}")
//	public Register getReg(@PathVariable("id") int id) {
//			return service.getReg(id);
//	}
	
	@GetMapping("{uname}")
	public Register getDetailsByUsername(@PathVariable("uname") String uname) {
		return service.findUsername(uname);
	}
	
	@PutMapping
	public String updateRegDetails(@RequestBody Register reg) {
		String msg = "";
		try {
			service.updateRegDetails(reg);
			msg = "Success";
		}
		catch(Exception e) {
			msg = "Failure";
		}
		return msg;
	}
	
	@DeleteMapping("{id}")
	public String deleteRegDetail(@PathVariable("id") int id) {
		String msg = "";
		try {
			service.deleteRegisterDetail(id);
			msg = "Success";
		}
		catch(Exception e) {
			msg = "Failure";
		}
		return msg;
	}
}
