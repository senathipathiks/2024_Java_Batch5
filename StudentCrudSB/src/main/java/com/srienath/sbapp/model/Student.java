package com.srienath.sbapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="stud90")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int sid;
	@Column
	private String sname;
	@Column
	private String scity;
	public int getId() {
		return sid;
	}
	public void setId(int id) {
		this.sid = id;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getScity() {
		return scity;
	}
	public void setScity(String scity) {
		this.scity = scity;
	}
	public Student(int id, String sname, String scity) {
		super();
		this.sid = id;
		this.sname = sname;
		this.scity = scity;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [id=" + sid + ", sname=" + sname + ", scity=" + scity + "]";
	}
	
	
}

