package com.madhan.hibernatetrainer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="trainer")
@Inheritance(strategy = InheritanceType.JOINED)
public class Trainer {
	
	@Id
	int trainerid;
	@Column(name="name")
	String trainername;
	@Column(name="experience")
	String experience;
	public Trainer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Trainer(int trainerid, String trainername, String experience) {
		super();
		this.trainerid = trainerid;
		this.trainername = trainername;
		this.experience = experience;
	}
	public int getTrainerid() {
		return trainerid;
	}
	public void setTrainerid(int trainerid) {
		this.trainerid = trainerid;
	}
	public String getTrainername() {
		return trainername;
	}
	public void setTrainername(String trainername) {
		this.trainername = trainername;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	
	


}
