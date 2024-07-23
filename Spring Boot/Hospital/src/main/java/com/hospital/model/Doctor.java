package com.hospital.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Doctor")
public class Doctor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Doctor_ID")
	private int did;
	@Column(name = "Doctor_Name")
	private String dname;
	@Column(name = "Doctor_Experience")
	private String dexperience;
	@Column(name = "Specialization")
	private String dspecial;
	
	@ManyToOne(cascade = CascadeType.MERGE,targetEntity = Hospital.class)
	@JoinColumn
	private Hospital hospital;

	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Doctor(int did, String dname, String dexperience, String dspecial, Hospital hospital) {
		super();
		this.did = did;
		this.dname = dname;
		this.dexperience = dexperience;
		this.dspecial = dspecial;
		this.hospital = hospital;
	}

	@Override
	public String toString() {
		return "Doctor [did=" + did + ", dname=" + dname + ", dexperience=" + dexperience + ", dspecial=" + dspecial
				+ ", hospital=" + hospital + "]";
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getDexperience() {
		return dexperience;
	}

	public void setDexperience(String dexperience) {
		this.dexperience = dexperience;
	}

	public String getDspecial() {
		return dspecial;
	}

	public void setDspecial(String dspecial) {
		this.dspecial = dspecial;
	}

	public Hospital getHospital() {
		return hospital;
	}

	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}

}
