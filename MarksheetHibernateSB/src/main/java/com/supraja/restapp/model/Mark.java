package com.supraja.restapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
 
@Entity
@Table(name = "marks")
public class Mark 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int clsId;
	@Column
	private int english;
	@Column
	private int maths;
	@Column
	private int computer;
	@Column
	private int totalMarks;
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
	public Mark(int clsId, int english, int maths, int computer, int totalMarks) {
		super();
		this.clsId = clsId;
		this.english = english;
		this.maths = maths;
		this.computer = computer;
		this.totalMarks = totalMarks;
	}
	public Mark() {
		super();
		// TODO Auto-generated constructor stub
	}
}