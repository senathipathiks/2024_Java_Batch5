package com.velan.restapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.velan.restapp.model.Attendance;
import com.velan.restapp.serviceimp.AttendanceServiceImp;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping("/attendance")
@CrossOrigin("*")
public class AttendanceController {

	@Autowired
	AttendanceServiceImp service;

	@PostMapping
	public String insertAttendance(@RequestBody Attendance attend) {
		String msg = "";

		try {
			service.addAttendance(attend);
			msg = "Success";
		}

		catch (Exception e) {
			e.printStackTrace();
			msg = "Failure";
		}
		return msg;
	}

	@GetMapping("{id}")
	public Attendance getAttendanceById(@PathVariable("id") int id) {

		return service.getAttendance(id);

	}

	@GetMapping("/all")
	public List<Attendance> getAttendance() {

		return service.getAllAttendance();

	}
	
	@PutMapping()
	public String updateAttendance(@RequestBody Attendance attend) {
		String msg = "";

		try {
			service.updateAttendance(attend);
			msg = "Success";
		}

		catch (Exception e) {
			e.printStackTrace();
			msg = "Failure";
		}
		return msg;
	}
	
	@DeleteMapping("{id}")
	public String deleteAttendanceById(@PathVariable("id")int id) {
		String msg="";
		try {
			service.deleteAttendance(id);
			msg="Sucess";
		} catch (Exception e) {
			e.printStackTrace();
			msg="Failure";
		}
		return msg;
	}
	
	@GetMapping("/idlist")
	public List<Integer> getIdList() {
		return service.getAllId();
	}
 
}
