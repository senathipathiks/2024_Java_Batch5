package com.nandha.AssociateMapping.OtoM;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Address101_1tom")
public class Address {
	
	@Id
	@Column(name = "addId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int aId;
	
	@Column(name = "empCity")
	private String city;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(int aId, String city) {
		super();
		this.aId = aId;
		this.city = city;
	}

	public int getaId() {
		return aId;
	}

	public void setaId(int aId) {
		this.aId = aId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [aId=" + aId + ", city=" + city + "]";
	}
	

}
