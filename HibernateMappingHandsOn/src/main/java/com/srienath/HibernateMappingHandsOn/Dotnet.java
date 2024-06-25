
package com.srienath.HibernateMappingHandsOn;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Dotnet extends Technical {
	
	int topics;
	@Column(name="tname")
	String trainerName;
	public Dotnet() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dotnet(int empId, String empName, String designation, int ttid, String tcname) {
		super(empId, empName, designation, ttid, tcname);
		// TODO Auto-generated constructor stub
	}
	public Dotnet(int empId, String empName, String designation) {
		super(empId, empName, designation);
		// TODO Auto-generated constructor stub
	}
	public Dotnet(int empId, String empName, String designation, int ttid, String tcname, int topics,
			String trainerName) {
		super(empId, empName, designation, ttid, tcname);
		this.topics = topics;
		this.trainerName = trainerName;
	}
	public int getTopics() {
		return topics;
	}
	public void setTopics(int topics) {
		this.topics = topics;
	}
	public String getTrainerName() {
		return trainerName;
	}
	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}
	
}
