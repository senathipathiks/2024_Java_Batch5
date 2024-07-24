package com.nandha.AssociateMapping.mtoo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Laptop101_mtoo")
public class Laptop {
	
	@Id
	@Column(name = "LaptopId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int lId;
	
	@Column(name = "LaptopName")
	private String lName;

	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Laptop(int lId, String lName) {
		super();
		this.lId = lId;
		this.lName = lName;
	}

	public int getlId() {
		return lId;
	}

	public void setlId(int lId) {
		this.lId = lId;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	@Override
	public String toString() {
		return "Laptop [lId=" + lId + ", lName=" + lName + "]";
	}
	
}
