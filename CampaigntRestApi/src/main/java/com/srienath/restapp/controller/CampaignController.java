package com.srienath.restapp.controller;

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

import com.srienath.restapp.model.Campaign;
import com.srienath.restapp.serviceimpl.CampaignServiceImpl;

@RestController
@RequestMapping("/campaign")
@CrossOrigin("*")
public class CampaignController {
	@Autowired
	CampaignServiceImpl service;
	
	@PostMapping
	public String insertCampaign(@RequestBody Campaign stud)
	{
		String msg="";
		try {
			service.addCampaign(stud);
			msg="Success";
		} 
		
		catch(Exception e) {
			e.printStackTrace();
			msg="Failure";
		}
		return msg;
	}
	
	@GetMapping("{id}")
	public Campaign getCampaignById(@PathVariable("id") int id) {
		return service.getCampaign(id);
	}
	
	@GetMapping("/all")
	public List<Campaign> getAllCampaigns() {
		return service.getAllCampaigns();
	}
	
	@PutMapping
	public String doUpdate(@RequestBody Campaign stud)
	{
		String msg="";
		try {
			service.updateCampaign(stud);
			msg="Success";
		} 
		
		catch(Exception e) {
			e.printStackTrace();
			msg="Failure";
		}
		return msg;
	}
	
	@DeleteMapping("{id}")
	public String deleteCamapaignById(@PathVariable("id") int id) {
		String msg="";
		try {
			service.deleteCampaign(id);
			msg="Success";
		} 
		
		catch(Exception e) {
			e.printStackTrace();
			msg="Failure";
		}
		return msg;
	}
}
