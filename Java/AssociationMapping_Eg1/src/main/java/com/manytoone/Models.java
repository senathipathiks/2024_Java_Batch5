package com.manytoone;

import java.util.ArrayList;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Models_manyone")
public class Models {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int model_id;
	@Column
	String model_name;
	@Column
	int price;
	
	public Models() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Models(int model_id, String model_name, int price) {
		super();
		this.model_id = model_id;
		this.model_name = model_name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Models [model_id=" + model_id + ", model_name=" + model_name + ", price=" + price + "]";
	}

	public int getModel_id() {
		return model_id;
	}

	public void setModel_id(int model_id) {
		this.model_id = model_id;
	}

	public String getModel_name() {
		return model_name;
	}

	public void setModel_name(String model_name) {
		this.model_name = model_name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}
