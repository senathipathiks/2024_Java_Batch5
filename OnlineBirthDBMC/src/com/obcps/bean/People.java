package com.obcps.bean;

public class People {
	String fatherName;
	String motherName;
	String childName;
	String gender;
	String timeOfBirth;
	String placeOfBirth;
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public String getChildName() {
		return childName;
	}
	public void setChildName(String childName) {
		this.childName = childName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getTimeOfBirth() {
		return timeOfBirth;
	}
	public void setTimeOfBirth(String timeOfBirth) {
		this.timeOfBirth = timeOfBirth;
	}
	public String getPlaceOfBirth() {
		return placeOfBirth;
	}
	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}
	public People(String fatherName, String motherName, String childName, String gender, String timeOfBirth,
			String placeOfBirth) {
		super();
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.childName = childName;
		this.gender = gender;
		this.timeOfBirth = timeOfBirth;
		this.placeOfBirth = placeOfBirth;
	}
	public People() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
