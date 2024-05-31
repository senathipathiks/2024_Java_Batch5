package com.day4.Faculty_Subject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Faculty {
	@Value("128")
	int fac_id;
	@Value("Senathipathi")
	String fac_name;
	@Value("Coimbatore")
	String fac_address;
	
	@Autowired
	private Subjects sub;
	
	public Faculty() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Faculty(int fac_id, String fac_name, String fac_address, Subjects sub) {
		super();
		this.fac_id = fac_id;
		this.fac_name = fac_name;
		this.fac_address = fac_address;
		this.sub = sub;
	}

	@Override
	public String toString() {
		return "\n Faculty [fac_id=" + fac_id + ", fac_name=" + fac_name + ", fac_address=" + fac_address + ", \nsub=" + sub
				+ "]";
	}

	public int getFac_id() {
		return fac_id;
	}

	public void setFac_id(int fac_id) {
		this.fac_id = fac_id;
	}

	public String getFac_name() {
		return fac_name;
	}

	public void setFac_name(String fac_name) {
		this.fac_name = fac_name;
	}

	public String getFac_address() {
		return fac_address;
	}

	public void setFac_address(String fac_address) {
		this.fac_address = fac_address;
	}

	public Subjects getSub() {
		return sub;
	}

	public void setSub(Subjects sub) {
		this.sub = sub;
	}
	
}
