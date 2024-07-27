package com.SpringBoot.Eg8.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "stu_tbl")
public class Student 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int stuid;
	@Column
	private String stuname;
	@Column
	private String stuclass;
	@Column
	private String stucity;
	
	public Student() 
	{
		super();
	}

	public Student(int stuid, String stuname, String stuclass, String stucity) {
		super();
		this.stuid = stuid;
		this.stuname = stuname;
		this.stuclass = stuclass;
		this.stucity = stucity;
	}

	public int getStuid() {
		return stuid;
	}

	public void setStuid(int stuid) {
		this.stuid = stuid;
	}

	public String getStuname() {
		return stuname;
	}

	public void setStuname(String stuname) {
		this.stuname = stuname;
	}

	public String getStuclass() {
		return stuclass;
	}

	public void setStuclass(String stuclass) {
		this.stuclass = stuclass;
	}

	public String getStucity() {
		return stucity;
	}

	public void setStucity(String stucity) {
		this.stucity = stucity;
	}

	@Override
	public String toString() {
		return "Student [stuid=" + stuid + ", stuname=" + stuname + ", stuclass=" + stuclass + ", stucity=" + stucity
				+ "]";
	}
}
