package com.springboot.assessment2.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "admission")
public class Admission 
{
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private int aid;
	@Column
	private String doa;
	@Column
	private String aname;
	
	public Admission() 
	{
		super();
	}

	public Admission(int aid, String doa, String aname) {
		super();
		this.aid = aid;
		this.doa = doa;
		this.aname = aname;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getDoa() {
		return doa;
	}

	public void setDoa(String doa) {
		this.doa = doa;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	@Override
	public String toString() {
		return "Admission [aid=" + aid + ", doa=" + doa + ", aname=" + aname + "]";
	}
}
