package com.aravind.InheritanceMapVehicle;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="four1")
public class FourWheeler extends Vehicle {
	String vmodel;
	String vprice;
	
	public FourWheeler() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FourWheeler(int vid, String vname) {
		super(vid, vname);
		// TODO Auto-generated constructor stub
	}
	
	
	
	public FourWheeler(int vid, String vname, String vmodel, String vprice) {
		super(vid, vname);
		this.vmodel = vmodel;
		this.vprice = vprice;
	}
	public String getVmodel() {
		return vmodel;
	}
	public void setVmodel(String vmodel) {
		this.vmodel = vmodel;
	}
	public String getVprice() {
		return vprice;
	}
	public void setVprice(String vprice) {
		this.vprice = vprice;
	}
	@Override
	public String toString() {
		return "FourWheeler [vmodel=" + vmodel + ", vprice=" + vprice + "]";
	}
	
	
	
	
	
	
	
	
	

}
