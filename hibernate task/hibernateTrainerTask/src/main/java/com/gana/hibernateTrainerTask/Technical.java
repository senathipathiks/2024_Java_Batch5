package com.gana.hibernateTrainerTask;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Technical1")
public class Technical extends Trainer {
	
	String qualification;
	String specification;
	public Technical() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Technical(int trainerid, String trainername, String city) {
		super(trainerid, trainername, city);
		// TODO Auto-generated constructor stub
	}
	public Technical(int trainerid, String trainername, String city, String qualification, String specification) {
		super(trainerid, trainername, city);
		this.qualification = qualification;
		this.specification = specification;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getSpecification() {
		return specification;
	}
	public void setSpecification(String specification) {
		this.specification = specification;
	}
	
	

}
