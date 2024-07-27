package com.springboot.eg12.service;

import java.util.List;

import com.springboot.eg12.model.Admin;

public interface AdminService 
{
	public void addAdmin(Admin admin);
	 
	public List<Admin> getallAdmins();

	public void updateAdmin(Admin admin);

	public void deleteAdmin(int adm_id);
	
	public Admin findAdminById(int adm_id);
	
	public Admin findAdminByName(String adm_name);
}
