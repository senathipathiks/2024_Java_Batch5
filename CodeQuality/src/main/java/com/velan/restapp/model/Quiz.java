package com.velan.restapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Quiz")
public class Quiz {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int tid;
	@Column
	private String title;
	@Column
	private String des;
	@Column
	private String ans;
	
	public Quiz() {
		super();
	}

	public Quiz(int tid, String title, String des, String ans) {
		super();
		this.tid = tid;
		this.title = title;
		this.des = des;
		this.ans = ans;
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDes() {
		return des;
	}

	public void setDes(String des) {
		this.des = des;
	}

	public String getAns() {
		return ans;
	}

	public void setAns(String ans) {
		this.ans = ans;
	}

	@Override
	public String toString() {
		return "Quiz [tid=" + tid + ", title=" + title + ", des=" + des + ", ans=" + ans + "]";
	}
}
