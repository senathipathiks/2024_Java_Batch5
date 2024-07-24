package com.supraja.restapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "booo")
public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bid;
	@Column
	private int bdate;
	@Column
	private int bustime;
	@Column
	private String busname;
	@Column
	private String source;
	@Column
	private String destination;

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public int getBdate() {
		return bdate;
	}

	public void setBdate(int bdate) {
		this.bdate = bdate;
	}

	public int getBustime() {
		return bustime;
	}

	public void setBustime(int bustime) {
		this.bustime = bustime;
	}

	public String getBusname() {
		return busname;
	}

	public void setBusname(String busname) {
		this.busname = busname;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Booking(int bid, int bdate, int bustime, String busname, String source, String destination) {
		super();
		this.bid = bid;
		this.bdate = bdate;
		this.bustime = bustime;
		this.busname = busname;
		this.source = source;
		this.destination = destination;
	}

	public Booking() {
		super();
	}

}