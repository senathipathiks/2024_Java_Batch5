package com.gopi.restapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gopi.restapp.model.FIR;
import com.gopi.restapp.serviceimpl.FIRServiceImpl;


@RestController
@RequestMapping("/fir")
@CrossOrigin("http://localhost:3002")
@EnableWebSecurity(debug = false)
public class FIRController {
	@Autowired
	FIRServiceImpl service;
	
	@PostMapping
	public String insertFIR(@RequestBody FIR fir) {
		String msgString = "";
		
		try {
			service.addFIR(fir);
			msgString = "Insertion Success";
		} catch (Exception e) {
			msgString = "InsertionFailure";
		}
		return msgString;
	}
	
	@GetMapping("{id}")
	public FIR getFIRById(@PathVariable("id") int id) {
		return service.getFIR(id);
	}
	
	@GetMapping("/all")
	public List<FIR> getFIR() {
		return service.getAllFIRs();
	}
	@PutMapping
	public String updateFIR(@RequestBody FIR fir) {
		String msgString = "";
		
		try {
			service.updateFIR(fir);
			msgString = "Updation Success";
		} catch (Exception e) {
			msgString = "Updation Failure";
		}
		return msgString;
	}
	@DeleteMapping("{id}")
	public String deleteFIRById(@PathVariable("id") int id) {
		String msgString = "";
		try {
			service.deleteFIR(id);
			msgString = "Deletion Success";
		} catch (Exception e) {
			msgString = "Deletion Failure";
		}
		return msgString;	
	}
}
