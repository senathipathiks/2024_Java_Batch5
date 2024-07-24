package com.keerthana.demo.Model;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class StudentBean {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sid;
	private String name;
	
	
	@OneToOne
	@JoinColumn(name="Class_id")
	@Autowired
	private MarksBean marks;
	
	public StudentBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MarksBean getMarks() {
		return marks;
	}
	public void setMarks(MarksBean marks) {
		this.marks = marks;
	}
	public StudentBean(int sid, String name, MarksBean marks) {
		super();
		this.sid = sid;
		this.name = name;
		this.marks = marks;
	}
	public StudentBean(int sid, String name) {
		super();
		this.sid = sid;
		this.name = name;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
