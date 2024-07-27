package com.springboot.eg12.repo;

import java.util.List;

import com.springboot.eg12.model.Admin;

public interface AdminRepo 
{
	public void save(Admin admin);

	public List<Admin> findAllAdmins();

	public void update(Admin admin);

	public void deleteById(int adm_id);
	
	public Admin findById(int adm_id);
	
	public Admin findByName(String adm_name);
}
