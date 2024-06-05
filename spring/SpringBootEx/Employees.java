package com.ani.SpringBootEx;

public class Employees {
	int id;
	String name;
	public Employees(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Employees() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employees [id=" + id + ", name=" + name + "]";
	}
	

}
