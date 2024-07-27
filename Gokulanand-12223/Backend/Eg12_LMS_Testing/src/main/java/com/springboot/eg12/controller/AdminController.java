package com.springboot.eg12.controller;

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

import com.springboot.eg12.model.Admin;
import com.springboot.eg12.service.AdminserviceImplementation;

@RestController
@RequestMapping("/admin")
@CrossOrigin("*")
public class AdminController 
{
	AdminserviceImplementation service;

	public AdminController(AdminserviceImplementation service) {
		super();
		this.service = service;
	}

	@PostMapping
	public  String insertAdmin(@RequestBody Admin admin)
	{
	String msg = "";
	try {
	service.addAdmin(admin);
	msg = "Successfully Added";
	}
	catch (Exception e) {
	msg = "Failed to Add";
	}
	return msg;
	}

	@GetMapping("/all")
	public List<Admin> readAllAdmins()
	{
	return service.getallAdmins();
	}

	@PutMapping
	public  String updateAdmin(@RequestBody Admin admin)
	{
	String msg = "";
	try {
	service.updateAdmin(admin);
	msg = "Successfully Updated";
	}
	catch (Exception e) {
	msg = "Failed to Update";
	}
	return msg;
	}

	@DeleteMapping("{adm_id}")
	public String deleteAdminbyId(@PathVariable("adm_id") int adm_id)
	{
	String msg = "";
	try {
	service.deleteAdmin(adm_id);
	msg = "Successfully Deleted";
	}
	catch (Exception e) {
	msg = "Failed to Delete";
	}
	return msg;	
	}
	
	@GetMapping("{adm_id}")
	public Admin findAdmin(@PathVariable("adm_id") int adm_id)
	{
			return service.findAdminById(adm_id);
	}
	
	@GetMapping("/getAdminByName/{adm_name}")
	public Admin findAdminByName(@PathVariable("adm_name") String adm_name)
	{
		return service.findAdminByName(adm_name);
	}
}
