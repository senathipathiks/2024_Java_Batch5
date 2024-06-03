package com.aravind.InheritanceMapAccount;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="current1")
public class Current extends Account {
	float bal;

	public Current() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Current(int accno, String bname) {
		super(accno, bname);
		// TODO Auto-generated constructor stub
	}

	public Current(int accno, String bname, float bal) {
		super(accno, bname);
		this.bal = bal;
	}

	public float getBal() {
		return bal;
	}

	public void setBal(float bal) {
		this.bal = bal;
	}

	@Override
	public String toString() {
		return "Current [bal=" + bal + "]";
	}
	
	

}
