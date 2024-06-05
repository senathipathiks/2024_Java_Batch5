package com.hibernate.onetoone;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.Table;

@Entity
@Table(name="Laptop1")
public class Laptop {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int id;
	//@Column(name="name")
	private String name;
	public Laptop() {
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
	
}
