package com.vicky.Task1;

public class Subject {

String maths;
String physics;
String chemistry;
public Subject() {
	super();
	// TODO Auto-generated constructor stub
}
public Subject(String maths, String physics, String chemistry) {
	super();
	this.maths = maths;
	this.physics = physics;
	this.chemistry = chemistry;
}
public String getMaths() {
	return maths;
}
public void setMaths(String maths) {
	this.maths = maths;
}
public String getPhysics() {
	return physics;
}
public void setPhysics(String physics) {
	this.physics = physics;
}
public String getChemistry() {
	return chemistry;
}
public void setChemistry(String chemistry) {
	this.chemistry = chemistry;
}
@Override
public String toString() {
	return "Subject [maths=" + maths + ", physics=" + physics + ", chemistry=" + chemistry + "]";
}
public void display() {
	System.out.println(maths);
	System.out.println(physics);
	System.out.println(chemistry);
}
	
}
