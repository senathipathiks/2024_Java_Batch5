package com.madhan.hibernatetrainer;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Technical")
//@AttributeOverrides({
//	@AttributeOverride(name="tid",column=@Column(name="trainerid")),
//	@AttributeOverride(name="tname",column=@Column(name="trainername")),
//	@AttributeOverride(name="texp",column=@Column(name="experience"))
//})
public class Behavior extends Trainer {
	
	String qualification;
	String specification;
	public Behavior() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Behavior(int trainerid, String trainername, String experience) {
		super(trainerid, trainername, experience);
		// TODO Auto-generated constructor stub
	}
	public Behavior(int trainerid, String trainername, String experience, String qualification, String specification) {
		super(trainerid, trainername, experience);
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
