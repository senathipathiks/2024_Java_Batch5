package com.prabha.restapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student_rest_table")

public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "username")

	private String username;
	@Column(name = "mail")

	private String mail;
	@Column(name = "phone")

	private int phone;

	public Student() {
		super();
	}

	public Student(int id, String username, String mail, int phone) {
		super();
		this.id = id;
		this.username = username;
		this.mail = mail;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", username=" + username + ", mail=" + mail + ", phone=" + phone + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

}
