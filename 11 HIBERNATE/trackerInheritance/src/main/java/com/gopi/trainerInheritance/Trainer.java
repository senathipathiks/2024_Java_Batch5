package com.gopi.trainerInheritance;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@Table(name="Trainer1PerClass")
@Table(name="Trainer2SubClass")
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Inheritance(strategy = InheritanceType.JOINED)
public class Trainer {

	@Id
	int trainerId;
	@Column
	String name;
	@Column
	String city;
	public Trainer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Trainer(int trainerId, String name, String city) {
		super();
		this.trainerId = trainerId;
		this.name = name;
		this.city = city;
	}
	public int getTrainerId() {
		return trainerId;
	}
	public void setTrainerId(int trainerId) {
		this.trainerId = trainerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
}
