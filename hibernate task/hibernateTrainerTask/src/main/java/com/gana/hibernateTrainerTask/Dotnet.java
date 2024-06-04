package com.gana.hibernateTrainerTask;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "dotnet5")

public class Dotnet extends Technical {
	
	int duration;

	public Dotnet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dotnet(int trainerid, String trainername, String city, String qualification, String specification) {
		super(trainerid, trainername, city, qualification, specification);
		// TODO Auto-generated constructor stub
	}

	public Dotnet(int trainerid, String trainername, String city) {
		super(trainerid, trainername, city);
		// TODO Auto-generated constructor stub
	}

	public Dotnet(int trainerid, String trainername, String city, String qualification, String specification,
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
