package com.gana.hibernateTrainerTask;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="trainer2")
@Inheritance(strategy = InheritanceType.JOINED)
public class Trainer {
	
	@Id
	int trainerid;
	
	@Column(name = "name")
	String trainername;
	
	@Column(name = "city")
	String city;

	public Trainer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Trainer(int trainerid, String trainername, String city) {
		super();
		this.trainerid = trainerid;
		this.trainername = trainername;
		this.city = city;
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Trainer [trainerid=" + trainerid + ", trainername=" + trainername + ", city=" + city + "]";
	}


	
	

}
