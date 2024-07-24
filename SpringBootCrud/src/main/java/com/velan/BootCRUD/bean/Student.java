package com.velan.BootCRUD.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
    private String sname;
	@Column
	private String scity;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String sname, String scity) {
		super();
		this.id = id;
		this.sname = sname;
		this.scity = scity;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	@Override
	public String toString() {
		return "Student [id=" + id + ", sname=" + sname + ", scity=" + scity + "]";
	}
	
	
}
