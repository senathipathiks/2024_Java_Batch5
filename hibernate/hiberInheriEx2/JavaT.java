package com.ani.hiberInheriEx2;

import javax.persistence.Entity;

@Entity
public class JavaT extends Technical {
	String duration;

	public JavaT() {
		super();
		// TODO Auto-generated constructor stub
	}

	public JavaT(int trainerid, String name, String city, String qualification, String designation) {
		super(trainerid, name, city, qualification, designation);
		// TODO Auto-generated constructor stub
	}

	public JavaT(int trainerid, String name, String city) {
		super(trainerid, name, city);
		// TODO Auto-generated constructor stub
	}

	public JavaT(int trainerid, String name, String city, String qualification, String designation, String duration) {
		super(trainerid, name, city, qualification, designation);
		this.duration = duration;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "JavaT [duration=" + duration + "]";
	}

	

	

}
