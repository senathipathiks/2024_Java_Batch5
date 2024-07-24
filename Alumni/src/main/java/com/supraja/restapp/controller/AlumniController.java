package com.supraja.restapp.controller;

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

import com.supraja.restapp.model.Alumni;
import com.supraja.restapp.serviceimpl.AlumniServiceImpl;

@RestController
@RequestMapping("/alumni")
@CrossOrigin("*")
public class AlumniController {

	public AlumniController(AlumniServiceImpl service) {
		super();
		this.service = service;
	}

	AlumniServiceImpl service;

	@PostMapping
	public String insertAlumni(@RequestBody Alumni alumni) {
		String msg = "";
		try {
			service.addAlumni(alumni);
			msg = "Successfull";
		} catch (Exception e) {
			msg = "Failure";
		}

		return msg;
	}

	@GetMapping("{id}")
	public Alumni getAlumnibyId(@PathVariable("id") int id) {
		return service.getAlumni(id);
	}

	@GetMapping("/all")
	public List<Alumni> getAlumni() {
		return service.getAllAlumni();
	}

	@PutMapping
	public String updateAlumni(@RequestBody Alumni alumni) {
		String msg = "";
		try {
			service.updateAlumni(alumni);
			msg = " Update Success";
		} catch (Exception e) {
			msg = "Failure update";
		}

		return msg;
	}

	@DeleteMapping("{id}")
	public String deleteAlumni(@PathVariable("id") int id) {
		String msg = "";
		try {
			service.deleteAlumni(id);
			msg = "Deletion Success";
		} catch (Exception e) {
			msg = " Deletion Failure";
		}

		return msg;
	}

	@GetMapping("/idlist")
	public List<Integer> getIDList() {
		return service.getAllId();
	}
}
