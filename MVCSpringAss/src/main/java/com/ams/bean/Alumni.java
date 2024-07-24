package com.ams.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="alum")
public class Alumni 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
   private int aid;
	@Column
   private String aname;
   @Column
	private String abatch;
   @Column
   private String adept;
public Alumni(int aid, String aname, String abatch, String adept) {
	super();
	this.aid = aid;
	this.aname = aname;
	this.abatch = abatch;
	this.adept = adept;
}
public Alumni() {
	super();
	// TODO Auto-generated constructor stub
}
public int getAid() {
	return aid;
}
public void setAid(int aid) {
	this.aid = aid;
}
public String getAname() {
	return aname;
}
public void setAname(String aname) {
	this.aname = aname;
}
public String getAbatch() {
	return abatch;
}
public void setAbatch(String abatch) {
	this.abatch = abatch;
}
public String getAdept() {
	return adept;
}
public void setAdept(String adept) {
	this.adept = adept;
}
@Override
public String toString() {
	return "Alumni [aid=" + aid + ", aname=" + aname + ", abatch=" + abatch + ", adept=" + adept + "]";
}
   
   
}
