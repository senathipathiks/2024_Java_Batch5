package com.SpringBoot.Eg8.Model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tea_tbl")
public class Teacher 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int tid;
	@Column
	private String tname;
	@Column
	private String designation;
	@Column
	private String tage;
	
	@OneToMany(targetEntity = Student.class, cascade = CascadeType.ALL)
	@JoinColumn
	private List<Student> student;

	public Teacher() 
	{
		super();
	}

	public Teacher(int tid, String tname, String designation, String tage, List<Student> student) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.designation = designation;
		this.tage = tage;
		this.student = student;
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getTage() {
		return tage;
	}

	public void setTage(String tage) {
		this.tage = tage;
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Teacher [tid=" + tid + ", tname=" + tname + ", designation=" + designation + ", tage=" + tage
				+ ", student=" + student + "]";
	}
}
