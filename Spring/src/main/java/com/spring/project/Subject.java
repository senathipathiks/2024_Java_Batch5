package com.spring.project;

public class Subject {
 String s1;
 int engmark ;
 String s2;
 int tammark;
 String s3;
 int matmark;
 String s4;
 int scimark;
 String s5;
 int socmark;
public Subject() {
	super();
	// TODO Auto-generated constructor stub
}
public Subject(String s1, int engmark, String s2, int tammark, String s3, int matmark, String s4, int scimark,
		String s5, int socmark) {
	super();
	this.s1 = s1;
	this.engmark = engmark;
	this.s2= s2;
	this.tammark = tammark;
	this.s3 = s3;
	this.matmark = matmark;
	this.s4 = s4;
	this.scimark = scimark;
	this.s5 = s5;
	this.socmark = socmark;
}
public String getEng() {
	return s1;
}
public void setEng(String s1) {
	this.s1 = s1;
}
public int getEngmark() {
	return engmark;
}
public void setEngmark(int engmark) {
	this.engmark = engmark;
}
public String gettam() {
	return s2;
}
public void settam(String s2) {
	this.s2 = s2;
}
public int getTammark() {
	return tammark;
}
public void setTammark(int tammark) {
	this.tammark = tammark;
}
public String getMat() {
	return s3;
}
public void setMat(String s3) {
	this.s3 = s3;
}
public int getMatmark() {
	return matmark;
}
public void setMatmark(int matmark) {
	this.matmark = matmark;
}
public String getSci() {
	return s4;
}
public void setSci(String s4) {
	this.s4 = s4;
}
public int getScimark() {
	return scimark;
}
public void setScimark(int scimark) {
	this.scimark = scimark;
}
public String getSoc() {
	return s5;
}
public void setSoc(String s5) {
	this.s5 = s5;
}
public int getSocmark() {
	return socmark;
}
public void setSocmark(int socmark) {
	this.socmark = socmark;
}
@Override
public String toString() {
	return "Subject [s1=" + s1 + ", EnglishMark=" + engmark + ", s2=" + s2 + ", TamilMark=" + tammark
			+ ", s3=" + s3 + ", MathsMark=" + matmark + ", s4=" + s4 + ", Sciencemark=" + scimark + ", s5=" + s5
			+ ", SocialMark=" + socmark + "]";
}
 
 
 
 
 
}
