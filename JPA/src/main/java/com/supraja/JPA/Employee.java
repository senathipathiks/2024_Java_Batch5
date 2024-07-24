package com.supraja.JPA;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="emp1")
@NamedQuery(query="select e from Employee e where e.id=?1",name="findById")
public class Employee 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
   int id;
   String name;
   String salary;
   String dept;
public Employee(int id, String name, String salary, String dept) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
	this.dept = dept;
}
public Employee() {
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
public String getSalary() {
	return salary;
}
public void setSalary(String salary) {
	this.salary = salary;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", dept=" + dept + "]";
}
   
   
}
