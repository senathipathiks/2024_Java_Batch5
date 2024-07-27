package com.manytoone;

import java.util.ArrayList;

import antlr.collections.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Brands_manyone")
public class Brands {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int brand_id;
	@Column
	String brand_name;
	
	@ManyToOne(cascade = CascadeType.ALL,targetEntity = Models.class)
	private ArrayList<Models> models;

	public Brands() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Brands(int brand_id, String brand_name) {
		super();
		this.brand_id = brand_id;
		this.brand_name = brand_name;
	}

	@Override
	public String toString() {
		return "Brands [brand_id=" + brand_id + ", brand_name=" + brand_name + "]";
	}

	public int getBrand_id() {
		return brand_id;
	}

	public void setBrand_id(int brand_id) {
		this.brand_id = brand_id;
	}

	public String getBrand_name() {
		return brand_name;
	}

	public void setBrand_name(String brand_name) {
		this.brand_name = brand_name;
	}

	public ArrayList<Models> getModels() {
		return models;
	}

	public void setModels(ArrayList<Models> models) {
		this.models = models;
	}

	
}
