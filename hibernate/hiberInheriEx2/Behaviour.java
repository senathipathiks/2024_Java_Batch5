package com.ani.hiberInheriEx2;

import javax.persistence.Entity;

@Entity
public class Behaviour extends Trainer {
	String qualification;
	String designation;
	public Behaviour() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Behaviour(int trainerid, String name, String city) {
		super(trainerid, name, city);
		// TODO Auto-generated constructor stub
	}
	public Behaviour(int trainerid, String name, String city, String qualification, String designation) {
		super(trainerid, name, city);
		this.qualification = qualification;
		this.designation = designation;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "Behaviour [qualification=" + qualification + ", designation=" + designation + "]";
	}
	
	
	
}
