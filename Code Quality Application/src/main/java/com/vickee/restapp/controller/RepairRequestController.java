package com.vickee.restapp.controller;

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

import com.vickee.restapp.model.RepairRequest;
import com.vickee.restapp.serviceimpl.RepairRequestServiceImpl;


@RestController
@RequestMapping("/repairshop")
@CrossOrigin("http://localhost:3000/")
public class RepairRequestController {
	
	
	
	RepairRequestServiceImpl service;
	
	
	public RepairRequestController(RepairRequestServiceImpl service) {
		super();
		this.service = service;
	}

	@PostMapping
	public void addRepair(@RequestBody RepairRequest repair) {
		service.addRepair(repair);
	}
	
	@GetMapping("{id}")
	public RepairRequest getRepair(@PathVariable int id)
	{
		return service.getRepair(id);
	}
	
	@GetMapping("/allrepair")
	public List<RepairRequest> getAllRepair()
	{
		return service.getAllRepair();
	}
	
	@PutMapping
	public void updateRepair(@RequestBody RepairRequest repair)
	{
		service.updateRepair(repair);
	}
	@DeleteMapping("{id}")
	public void deleteRepair(@PathVariable int id) {
		service.deleteRepair(id);
	}
	
	@GetMapping("/oidList")
	public List<Integer> getAllOids()
	{
		return service.getAllOids();
	}
}
