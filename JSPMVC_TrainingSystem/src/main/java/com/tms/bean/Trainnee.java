package com.tms.bean;

public class Trainnee 
{
	  String traineeid;
	  String traineename;
	  String traineedept;
	  String trainingrole;
	public Trainnee(String traineeid, String traineename, String traineedept, String trainingrole) {
		super();
		this.traineeid = traineeid;
		this.traineename = traineename;
		this.traineedept = traineedept;
		this.trainingrole = trainingrole;
	}
	public Trainnee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getTraineeid() {
		return traineeid;
	}
	public void setTraineeid(String traineeid) {
		this.traineeid = traineeid;
	}
	public String getTraineename() {
		return traineename;
	}
	public void setTraineename(String traineename) {
		this.traineename = traineename;
	}
	public String getTraineedept() {
		return traineedept;
	}
	public void setTraineedept(String traineedept) {
		this.traineedept = traineedept;
	}
	public String getTrainingrole() {
		return trainingrole;
	}
	public void setTrainingrole(String trainingrole) {
		this.trainingrole = trainingrole;
	}
}
