package com.supraja.restapp.model;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int id;
	@Column
	private String name;
	@Column

	private String std;
	@Column
	private String age;
	@Column
	private String city;

	@OneToOne(targetEntity = Admission.class, cascade = CascadeType.ALL)
	private Admission admission;

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

	public String getStd() {
		return std;
	}

	public void setStd(String std) {
		this.std = std;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Admission getAdmission() {
		return admission;
	}

	public void setAdmission(Admission admission) {
		this.admission = admission;
	}

	public Student(int id, String name, String std, String age, String city, Admission admission) {
		super();
		this.id = id;
		this.name = name;
		this.std = std;
		this.age = age;
		this.city = city;
		this.admission = admission;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

}