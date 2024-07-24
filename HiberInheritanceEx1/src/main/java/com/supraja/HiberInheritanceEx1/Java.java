package com.supraja.HiberInheritanceEx1;

import javax.persistence.Entity;

@Entity
public class Java extends Technical 
{
   int topics;
   String trainerName;
public Java(int eid, String ename, String desig, int cid, String cname, int topics, String trainerName) {
	super(eid, ename, desig, cid, cname);
	this.topics = topics;
	this.trainerName = trainerName;
}
public Java() {
	super();
	// TODO Auto-generated constructor stub
}
public Java(int eid, String ename, String desig, int cid, String cname) {
	super(eid, ename, desig, cid, cname);
	// TODO Auto-generated constructor stub
}
public Java(int eid, String ename, String desig) {
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
