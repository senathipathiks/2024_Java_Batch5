package com.gopi.restapp.model;

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
@Table(name="FIR")
public class FIR {
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private int firid;
	@Column
	private int firnum;
	@Column
	private String name;
	@Column
	private String address;
	@Column
	private String date;
	@Column
	private String time;
	@Column
	private String description;
	@Column
	private String status;
	@Column
	private String criminalname;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "policeStation")
	private PoliceStation policeStation;
	public FIR() {
		super();
		
	}
	public FIR(int firid, int firnum, String name, String address, String date, String time, String description,
			String status, String criminalname, PoliceStation policeStation) {
		super();
		this.firid = firid;
		this.firnum = firnum;
		this.name = name;
		this.address = address;
		this.date = date;
		this.time = time;
		this.description = description;
		this.status = status;
		this.criminalname = criminalname;
		this.policeStation = policeStation;
	}
	public int getFirid() {
		return firid;
	}
	public void setFirid(int firid) {
		this.firid = firid;
	}
	public int getFirnum() {
		return firnum;
	}
	public void setFirnum(int firnum) {
		this.firnum = firnum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCriminalname() {
		return criminalname;
	}
	public void setCriminalname(String criminalname) {
		this.criminalname = criminalname;
	}
	public PoliceStation getPoliceStation() {
		return policeStation;
	}
	public void setPoliceStation(PoliceStation policeStation) {
		this.policeStation = policeStation;
	}
	@Override
	public String toString() {
		return "FIR [firid=" + firid + ", firnum=" + firnum + ", name=" + name + ", address=" + address + ", date="
				+ date + ", time=" + time + ", description=" + description + ", status=" + status + ", criminalname="
				+ criminalname + ", policeStation=" + policeStation + "]";
	}
	
	
}
