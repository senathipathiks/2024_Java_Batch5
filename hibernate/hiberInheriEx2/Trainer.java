package com.ani.hiberInheriEx2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
@Entity
@Table(name="Trainers")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Trainer {
	@Id
	int trainerid;
	
	@Column
	String name;
	
	@Column
	String city;
	
	public Trainer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Trainer(int trainerid, String name, String city) {
		super();
		this.trainerid = trainerid;
		this.name = name;
		this.city = city;
	}
	public int getTrainerid() {
		return trainerid;
	}
	public void setTrainerid(int trainerid) {
		this.trainerid = trainerid;
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
	@Override
	public String toString() {
		return "Trainer [trainerid=" + trainerid + ", name=" + name + ", city=" + city + "]";
	}
	
	

}
