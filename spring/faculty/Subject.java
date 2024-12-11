package com.spring.faculty;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Subject {
	@Value ("Core-Java")
	 String s1;
		@Value("1")
	 int subjid ;
		@Value("12-Sessions")
	 String s2;
		@Value("8")
	 int Chapters;
//		@Value("Maths")
//	 String s3;
//		@Value("90")
//	 int matmark;
//		@Value("Science")
//	 String s4;
//		@Value("93")
//	 int scimark;
//		@Value("Social")
//	 String s5;
//		@Value("99")
//	 int socmark;
public Subject() {
	super();
	// TODO Auto-generated constructor stub
}
public Subject(String s1, int subjid, String s2, int Chapters) {
	super();
	this.s1 = s1;
	this.subjid = subjid;
	this.s2= s2;
	this.Chapters = Chapters;
	
}
public String getEng() {
	return s1;
}
public void setEng(String s1) {
	this.s1 = s1;
}
public int getsubjid() {
	return subjid;
}
public void setsubjid(int subjid) {
	this.subjid = subjid;
}
public String gettam() {
	return s2;
}
public void settam(String s2) {
	this.s2 = s2;
}
public int getChapters() {
	return Chapters;
}
public void setChapters(int Chapters) {
	this.Chapters = Chapters;
}

@Override
public String toString() {
	return "Subject name =" + s1 + ", Subject ID =" + subjid + ", No of Sessions=" + s2 + ", NO OF Chapters=" + Chapters
			+ "]";
}
 
 
 
 
 
}
