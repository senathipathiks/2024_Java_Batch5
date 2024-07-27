package com.springboot.eg12.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.eg12.model.Admin;
import com.springboot.eg12.repo.AdminRepo;

@Service
public class AdminserviceImplementation implements AdminService
{
	AdminRepo repo;

	public AdminserviceImplementation(AdminRepo repo) {
		super();
		this.repo = repo;
	}

	@Override
	public void addAdmin(Admin admin) 
	{
		repo.save(admin);
	}

	@Override
	public List<Admin> getallAdmins() 
	{
		return repo.findAllAdmins();
	}

	@Override
	public void updateAdmin(Admin admin) 
	{
		repo.update(admin);
	}

	@Override
	public void deleteAdmin(int adm_id) 
	{
		repo.deleteById(adm_id);
	}

	@Override
	public Admin findAdminById(int adm_id) 
	{
		return repo.findById(adm_id);
	}

	@Override
	public Admin findAdminByName(String adm_name) 
	{
		return repo.findByName(adm_name);
	}
}
