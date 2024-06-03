package com.aravind.InheritanceMapTraineer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="Trainer2")
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Inheritance(strategy = InheritanceType.JOINED)
public class Trainner {
	@Id
	int tid;
	@Column
	String tname;
	@Column
	String city;
	
	
	public Trainner() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Trainner(int tid, String tname, String city) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.city = city;
	}


	public int getTid() {
		return tid;
	}


	public void setTid(int tid) {
		this.tid = tid;
	}


	public String getTname() {
		return tname;
	}


	public void setTname(String tname) {
		this.tname = tname;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	@Override
	public String toString() {
		return "Trainner [tid=" + tid + ", tname=" + tname + ", city=" + city + "]";
	}
	
	
	
	

}
