package com.springboot.eg12.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table( name = "admin")
public class Admin 
{
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private int adm_id;
	private String adm_name;
	private String adm_designation;
	private String adm_department;
	
	public Admin() 
	{
		super();
	}

	public Admin(int adm_id, String adm_name, String adm_designation, String adm_department) {
		super();
		this.adm_id = adm_id;
		this.adm_name = adm_name;
		this.adm_designation = adm_designation;
		this.adm_department = adm_department;
	}

	public int getAdm_id() {
		return adm_id;
	}

	public void setAdm_id(int adm_id) {
		this.adm_id = adm_id;
	}

	public String getAdm_name() {
		return adm_name;
	}

	public void setAdm_name(String adm_name) {
		this.adm_name = adm_name;
	}

	public String getAdm_designation() {
		return adm_designation;
	}

	public void setAdm_designation(String adm_designation) {
		this.adm_designation = adm_designation;
	}

	public String getAdm_department() {
		return adm_department;
	}

	public void setAdm_department(String adm_department) {
		this.adm_department = adm_department;
	}

	@Override
	public String toString() {
		return "Admin [adm_id=" + adm_id + ", adm_name=" + adm_name + ", adm_designation=" + adm_designation
				+ ", adm_department=" + adm_department + "]";
	}
}
