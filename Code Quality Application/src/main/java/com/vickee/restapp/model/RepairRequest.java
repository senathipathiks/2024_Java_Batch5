package com.vickee.restapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "repair_tbl")
public class RepairRequest {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int oid;
	private String cusname;
	private String city;
	private String repairtype;
	public RepairRequest() {
		super();
	}
	
	public RepairRequest(int oid, String cusname, String city, String repairtype) {
		super();
		this.oid = oid;
		this.cusname = cusname;
		this.city = city;
		this.repairtype = repairtype;
	}
	
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public String getCusname() {
		return cusname;
	}
	public void setCusname(String cusname) {
		this.cusname = cusname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getRepairtype() {
		return repairtype;
	}
	public void setRepairtype(String repairtype) {
		this.repairtype = repairtype;
	}
		
}
