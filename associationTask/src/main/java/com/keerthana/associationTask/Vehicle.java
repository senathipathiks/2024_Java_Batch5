package com.keerthana.associationTask;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Vehicle {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int vid;
	private String vname;
	@ManyToMany(mappedBy="vehicle")
	private Collection<User> user=new ArrayList<>();;
	
	public int getVid() {
		return vid;
	}

	public void setVid(int vid) {
		this.vid = vid;
	}

	public String getVname() {
		return vname;
	}

	public void setVname(String vname) {
		this.vname = vname;
	}

	public Collection<User> getUser() {
		return user;
	}

	public void setUser(Collection<User> user) {
		this.user = user;
	}

	public Vehicle(int vid, String vname, Collection<User> user) {
		super();
		this.vid = vid;
		this.vname = vname;
		this.user = user;
	}

	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	

}
