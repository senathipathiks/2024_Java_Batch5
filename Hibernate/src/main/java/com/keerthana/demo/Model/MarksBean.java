package com.keerthana.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class MarksBean {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int clsId;
	private int english;
	private int maths;
	private int computer;
	private int totalMarks;
	
	//totalMarks=english+maths+computer;
	
	
	public MarksBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MarksBean(int clsId, int english, int maths, int computer, int totalMarks) {
		super();
		this.clsId = clsId;
		this.english = english;
		this.maths = maths;
		this.computer = computer;
		this.totalMarks = totalMarks;
	}
	public int getClsId() {
		return clsId;
	}
	public void setClsId(int clsId) {
		this.clsId = clsId;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getMaths() {
		return maths;
	}
	public void setMaths(int maths) {
		this.maths = maths;
	}
	public int getComputer() {
		return computer;
	}
	public void setComputer(int computer) {
		this.computer = computer;
	}
	public int getTotalMarks() {
		return totalMarks;
	}
	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}
	
	
}
