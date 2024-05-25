package com.osm.bean;

public class Member {
	private int id;
	private String name;
	private String location;
	private String email;
	private int totalSurveytaken;

	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Member(int id, String name, String location, String email, int totalSurveytaken) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.email = email;
		this.totalSurveytaken = totalSurveytaken;
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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTotalSurveytaken() {
		return totalSurveytaken;
	}

	public void setTotalSurveytaken(int totalSurveytaken) {
		this.totalSurveytaken = totalSurveytaken;
	}
}
