package com.supraja.restapp.controller;

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

import com.supraja.restapp.model.Admission;
import com.supraja.restapp.serviceimpl.AdmissionServiceImpl;

@RestController
@RequestMapping("/admission")
@CrossOrigin("*")
public class AdmissionController {
	@Autowired
	AdmissionServiceImpl service;

	@PostMapping
	public String insertAdmission(@RequestBody Admission admi) {
		String msg = "";
		try {
			service.addAdmission(admi);
			System.out.println(admi);
			msg = "Success";
		} catch (Exception e) {
			e.printStackTrace();
			msg = "Failure";
		}

		return msg;
	}

	@GetMapping("{id}")
	public Admission getAdmissionbyId(@PathVariable("id") int id) {
		return service.getAdmission(id);
	}

	@GetMapping("/all")
	public List<Admission> getAdmission() {
		return service.getAllAdmission();
	}

	@PutMapping
	public String updateAdmission(@RequestBody Admission admi) {
		String msg = "";
		try {
			service.updateAdmission(admi);
			msg = "Success";
		} catch (Exception e) {
			e.printStackTrace();
			msg = "Failure";
		}

		return msg;
	}

	@DeleteMapping("{id}")
	public String deleteAdmission(@PathVariable int id) {
		String msg = "";
		try {
			service.deleteAdmission(id);
			msg = "Success";
		} catch (Exception e) {
			e.printStackTrace();
			msg = "Failure";
		}

		return msg;
	}

	@GetMapping("/idlist")
	public List<Integer> getIDList() {
		return service.getAllId();
	}
}
