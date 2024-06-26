package com.gopi.restapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "PoliceStation")
public class PoliceStation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int stationid;
	@Column
	private String stationname;
	@Column
	private String location;
	@Column
	private String mobilenum;
	@Column
	private String inspectorname;
	@Column
	private String adminname;
	public PoliceStation() {
		super();
		
	}
	public PoliceStation(int stationid, String stationname, String location, String mobilenum, String inspectorname,
			String adminname) {
		super();
		this.stationid = stationid;
		this.stationname = stationname;
		this.location = location;
		this.mobilenum = mobilenum;
		this.inspectorname = inspectorname;
		this.adminname = adminname;
	}
	public int getStationid() {
		return stationid;
	}
	public void setStationid(int stationid) {
		this.stationid = stationid;
	}
	public String getStationname() {
		return stationname;
	}
	public void setStationname(String stationname) {
		this.stationname = stationname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getMobilenum() {
		return mobilenum;
	}
	public void setMobilenum(String mobilenum) {
		this.mobilenum = mobilenum;
	}
	public String getInspectorname() {
		return inspectorname;
	}
	public void setInspectorname(String inspectorname) {
		this.inspectorname = inspectorname;
	}
	public String getAdminname() {
		return adminname;
	}
	public void setAdminname(String adminname) {
		this.adminname = adminname;
	}
	@Override
	public String toString() {
		return "PoliceStation [stationid=" + stationid + ", stationname=" + stationname + ", location=" + location
				+ ", mobilenum=" + mobilenum + ", inspectorname=" + inspectorname + ", adminname=" + adminname + "]";
	}
	
	
	
}
