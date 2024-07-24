package com.karthi.testing.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Request")
public class Request {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private int id;
	@Column(name = "Name")
	private String name;
	@Column(name = "Age")
	private int age;
	@Column(name = "Number")
	private long number;
	@Column(name = "Gender")
	private String gender;
	@Column(name = "blood")
	private String blood;

	@ManyToOne
	@JoinColumn
	BloodBank bank;

	public Request() {
		super();
	}

	public Request(int id, String name, int age, long number, String gender, String blood, BloodBank bank) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.number = number;
		this.gender = gender;
		this.blood = blood;
		this.bank = bank;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBlood() {
		return blood;
	}

	public void setBlood(String blood) {
		this.blood = blood;
	}

	public BloodBank getBank() {
		return bank;
	}

	public void setBank(BloodBank bank) {
		this.bank = bank;
	}

}
