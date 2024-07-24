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
import com.supraja.restapp.model.CollegeEvent;
import com.supraja.restapp.serviceimpl.CollegeEventServiceImpl;

@RestController
@RequestMapping("/event")
@CrossOrigin("*")
public class CollegeEventController {

	public CollegeEventController(CollegeEventServiceImpl service) {
		super();
		this.service = service;
	}

	CollegeEventServiceImpl service;

	@PostMapping
	public String insertEvent(@RequestBody CollegeEvent event) {
		String msg = "";
		try {
			service.addCollegeEvent(event);
			msg = "Successfully added";
		} catch (Exception e) {
			msg = "Failure";
		}
		return msg;
	}

	@GetMapping("{id}")
	public CollegeEvent getEventbyId(@PathVariable("id") int id) {
		return service.getCollegeEvent(id);
	}

	@GetMapping("/all")
	public List<CollegeEvent> getEvent() {
		return service.getAllCollegeEvent();
	}

	@PutMapping
	public String updateEvent(@RequestBody CollegeEvent event) {
		String msg = "";
		try {
			service.updateCollegeEvent(event);
			msg = "Updated Success";
		} catch (Exception e) {
			msg = "Updated Failure";
		}

		return msg;
	}

	@DeleteMapping("{id}")
	public String deleteEvent(@PathVariable int id) {
		String msg = "";
		try {
			service.deleteCollegeEvent(id);
			msg = "Deleted Successfully";
		} catch (Exception e) {
			msg = "Deletion Failure";
		}

		return msg;
	}
}
