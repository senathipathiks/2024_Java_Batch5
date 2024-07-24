package com.assessment.App.model;


import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Usertable")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int id;

    private String name;
    
    private String emailid;
    
    private String Address;
    
    private int PhoneNumber;
       
   
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	public User(int id, String name, String emailid, String address, int phoneNumber) {
		super();
		this.id = id;
		this.name = name;
		this.emailid = emailid;
		Address = address;
		PhoneNumber = phoneNumber;
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


	public String getEmailid() {
		return emailid;
	}


	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}


	public String getAddress() {
		return Address;
	}


	public void setAddress(String address) {
		Address = address;
	}


	public int getPhoneNumber() {
		return PhoneNumber;
	}


	public void setPhoneNumber(int phoneNumber) {
		PhoneNumber = phoneNumber;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", emailid=" + emailid + ", Address=" + Address + ", PhoneNumber="
				+ PhoneNumber + "]";
	}

	
}

