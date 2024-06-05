package com.srienath.ScopeDay2;

public class Student {
	private int studID;
	private String studName;
	public int getStudID() {
		return studID;
	}
	public void setStudID(int studID) {
		this.studID = studID;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public Student(int studID, String studName) {
		super();
		this.studID = studID;
		this.studName = studName;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [StudID=" + studID +", StudName=" + studName + "]";
	}
}
