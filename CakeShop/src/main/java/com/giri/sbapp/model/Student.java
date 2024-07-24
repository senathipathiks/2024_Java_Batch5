package com.giri.sbapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;
	
	@Column
	private String name;
	
	@Column
	private long mobile;
	
	@Column
	private String party;
	
	@Column 
	private String contestant;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, long mobile, String party, String contestant) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		this.party = party;
		this.contestant = contestant;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getParty() {
		return party;
	}

	public void setParty(String party) {
		this.party = party;
	}

	public String getContestant() {
		return contestant;
	}

	public void setContestant(String contestant) {
		this.contestant = contestant;
	}
	
	

}