package com.subash.DependencyInjection;

public class Subject {

	String maths;
	String tamil;
	String english;
	String science;
	String social;
	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getMaths() {
		return maths;
	}
	public void setMaths(String maths) {
		this.maths = maths;
	}
	public String getTamil() {
		return tamil;
	}
	public void setTamil(String tamil) {
		this.tamil = tamil;
	}
	public String getEnglish() {
		return english;
	}
	public void setEnglish(String english) {
		this.english = english;
	}
	public String getScience() {
		return science;
	}
	public void setScience(String science) {
		this.science = science;
	}
	public String getSocial() {
		return social;
	}
	public void setSocial(String social) {
		this.social = social;
	}
	public Subject(String maths, String tamil, String english, String science, String social) {
		super();
		this.maths = maths;
		this.tamil = tamil;
		this.english = english;
		this.science = science;
		this.social = social;
	}
	@Override
	public String toString() {
		return "Subject [maths=" + maths + ", tamil=" + tamil + ", english=" + english + ", science=" + science
				+ ", social=" + social + "]";
	}
	
	

}
