package com.day2.Task1;

public class Subjects {
	String Tamil;
	String English;
	String Maths;
	String Science;
	String Social;
	
	public Subjects() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Subjects(String tamil, String english, String maths, String science, String social) {
		super();
		Tamil = tamil;
		English = english;
		Maths = maths;
		Science = science;
		Social = social;
	}

	public String getTamil() {
		return Tamil;
	}

	public void setTamil(String tamil) {
		Tamil = tamil;
	}

	public String getEnglish() {
		return English;
	}

	public void setEnglish(String english) {
		English = english;
	}

	public String getMaths() {
		return Maths;
	}

	public void setMaths(String maths) {
		Maths = maths;
	}

	public String getScience() {
		return Science;
	}

	public void setScience(String science) {
		Science = science;
	}

	public String getSocial() {
		return Social;
	}

	public void setSocial(String social) {
		Social = social;
	}

	@Override
	public String toString() {
		return "Subjects [Tamil=" + Tamil + ", English=" + English + ", Maths=" + Maths + ", Science=" + Science
				+ ", Social=" + Social + "]";
	}
	
	
}
