package com.supraja.HiberInheritanceEx1;

import javax.persistence.Entity;

@Entity
public class Dotnet extends Technical 
{
    int topics;
    String trainerName;
	public Dotnet(int eid, String ename, String desig, int cid, String cname, int topics, String trainerName) {
		super(eid, ename, desig, cid, cname);
		this.topics = topics;
		this.trainerName = trainerName;
	}
	public Dotnet() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dotnet(int eid, String ename, String desig, int cid, String cname) {
		super(eid, ename, desig, cid, cname);
		// TODO Auto-generated constructor stub
	}
	public Dotnet(int eid, String ename, String desig) {
		super(eid, ename, desig);
		// TODO Auto-generated constructor stub
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
