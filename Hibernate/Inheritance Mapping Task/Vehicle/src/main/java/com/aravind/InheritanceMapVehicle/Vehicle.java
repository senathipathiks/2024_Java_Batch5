package com.aravind.InheritanceMapVehicle;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
//@Table(name="vehicle")
//@Table(name="vehicle1")
@Table(name="vehicle2")
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE )
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS )
@Inheritance(strategy = InheritanceType.JOINED )
public class Vehicle {
	@Id
	int vid;
	
	@Column
	String vname;

	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vehicle(int vid, String vname) {
		super();
		this.vid = vid;
		this.vname = vname;
	}

	public int getVid() {
		return vid;
	}

	public void setVid(int vid) {
		this.vid = vid;
	}

	public String getVname() {
		return vname;
	}

	public void setVname(String vname) {
		this.vname = vname;
	}

	@Override
	public String toString() {
		return "Vehicle [vid=" + vid + ", vname=" + vname + "]";
	}
	
	
	
	
	

}
