package com.gana.hibernateTrainerTask;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "java1")

public class Java extends Technical {
	
	int duration;

	public Java() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Java(int trainerid, String trainername, String city, String qualification, String specification) {
		super(trainerid, trainername, city, qualification, specification);
		// TODO Auto-generated constructor stub
	}

	public Java(int trainerid, String trainername, String city) {
		super(trainerid, trainername, city);
		// TODO Auto-generated constructor stub
	}

	public Java(int trainerid, String trainername, String city, String qualification, String specification,
			int duration) {
		super(trainerid, trainername, city, qualification, specification);
		this.duration = duration;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}
	

}
