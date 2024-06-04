package com.madhan.hibernatevechile;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Fourwheeler")
@AttributeOverrides({
	@AttributeOverride(name="vno",column=@Column(name="vno")),
	@AttributeOverride(name="vname",column=@Column(name="vname")),
	
})
public class Fourwheeler extends Vechile {
	
	String model;
	int price;
	public Fourwheeler() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Fourwheeler(int vno, String vname) {
		super(vno, vname);
		// TODO Auto-generated constructor stub
	}
	public Fourwheeler(int vno, String vname, String model, int price) {
		super(vno, vname);
		this.model = model;
		this.price = price;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	

}
