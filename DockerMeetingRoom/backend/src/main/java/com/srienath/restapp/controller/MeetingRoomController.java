package com.srienath.restapp.controller;

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

import com.srienath.restapp.model.MeetingRoom;
import com.srienath.restapp.serviceimpl.MeetingRoomServiceImpl;

@RestController
@RequestMapping("/meetroom")
@CrossOrigin("*")
public class MeetingRoomController {
	MeetingRoomServiceImpl service;
	
	public MeetingRoomController(MeetingRoomServiceImpl service) {
		super();
		this.service = service;
	}

	@PostMapping
	public String insertMeetRoom(@RequestBody MeetingRoom meetroom)
	{
		String msg="";
		try {
			service.addMeetRoom(meetroom);
			msg="Success";
		} 
		
		catch(Exception e) {
			e.printStackTrace();
			msg="Failure";
		}
		return msg;
	}
	
	@GetMapping("{id}")
	public MeetingRoom getMeetRoomById(@PathVariable("id") int id) {
		return service.getMeetRoom(id);
	}
	
	@GetMapping("/all")
	public List<MeetingRoom> getAllMeetRooms() {
		return service.getAllMeetRooms();
	}
	
	@PutMapping
	public String doUpdate(@RequestBody MeetingRoom meetroom)
	{
		String msg="";
		try {
			service.updateMeetRoom(meetroom);
			msg="Success";
		} 
		
		catch(Exception e) {
			e.printStackTrace();
			msg="Failure";
		}
		return msg;
	}
	
	@DeleteMapping("{id}")
	public String deleteMeetRoomById(@PathVariable("id") int id) {
		
		String msg="";
		try {
			service.deleteMeetRoom(id);
			msg="Success";
		} 
		
		catch(Exception e) {
			e.printStackTrace();
			msg="Failure";
		}
		return msg;
	}
}
