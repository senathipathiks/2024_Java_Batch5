package com.subash.JPA;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedEntityGraph;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "EmployeeJPA")
//@NamedEntityGraph(value = {
//// @NamedQuery(name = "select")
//})

@NamedQuery(query = "select e from Employee e where e.id =?1", name="findById")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "EmpID")
	int id;
	@Column(name = "Empname")
	String name;
	@Column(name = "Ebatch")
	int batch;
	@Column(name = "Salary")
	int sal;
	@Column(name = "Edept")
	String dept;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, int batch, int sal,String dept) {
		super();
		this.id = id;
		this.name = name;
		this.batch = batch;
		this.sal = sal;
		this.dept = dept;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
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

	public int getBatch() {
		return batch;
	}

	public void setBatch(int batch) {
		this.batch = batch;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", batch=" + batch + ", sal=" + sal + ", dept=" + dept + "]";
	}
}
