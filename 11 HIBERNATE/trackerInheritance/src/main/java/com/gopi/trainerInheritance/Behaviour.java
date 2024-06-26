package com.gopi.trainerInheritance;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Behaviour2Joined")
public class Behaviour extends Trainer {

	String specification;
	String qualification;
	public Behaviour() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Behaviour(int trainerId, String name, String city) {
		super(trainerId, name, city);
		// TODO Auto-generated constructor stub
	}
	public Behaviour(int trainerId, String name, String city, String specification, String qualification) {
		super(trainerId, name, city);
		this.specification = specification;
		this.qualification = qualification;
	}
	public String getSpecification() {
		return specification;
	}
	public void setSpecification(String specification) {
		this.specification = specification;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	
	
}
