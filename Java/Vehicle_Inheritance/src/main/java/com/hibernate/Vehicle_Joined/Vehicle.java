package com.hibernate.Vehicle_Joined;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;

@Entity
@Table(name = "Vehicle_Joined")
@Inheritance(strategy = InheritanceType.JOINED)
public class Vehicle {
	@Id
	int vid;
	@Column
	String owner_name;
	@Column
	String FC_date;
	
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vehicle(int vid, String owner_name, String fC_date) {
		super();
		this.vid = vid;
		this.owner_name = owner_name;
		FC_date = fC_date;
	}

	public int getVid() {
		return vid;
	}

	public void setVid(int vid) {
		this.vid = vid;
	}

	public String getOwner_name() {
		return owner_name;
	}

	public void setOwner_name(String owner_name) {
		this.owner_name = owner_name;
	}

	public String getFC_date() {
		return FC_date;
	}

	public void setFC_date(String fC_date) {
		FC_date = fC_date;
	}

	@Override
	public String toString() {
		return "Vehicle [vid=" + vid + ", owner_name=" + owner_name + ", FC_date=" + FC_date + "]";
	}
	
	
}
