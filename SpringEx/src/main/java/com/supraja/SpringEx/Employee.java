package com.supraja.SpringEx;

public class Employee 
{
  int id;
  String name;
public Employee(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + "]";
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
}
