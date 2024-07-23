package com.day4.Emp_Dep;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Department {
	@Value("11")
	String dep_id;
	@Value("Full Stack Developer")
	String dep_name;
	@Value("8")
	String quantity;
	
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(String dep_id, String dep_name, String quantity) {
		super();
		this.dep_id = dep_id;
		this.dep_name = dep_name;
		this.quantity = quantity;
	}	

	public String getDep_id() {
		return dep_id;
	}

	public void setDep_id(String dep_id) {
		this.dep_id = dep_id;
	}

	public String getDep_name() {
		return dep_name;
	}

	public void setDep_name(String dep_name) {
		this.dep_name = dep_name;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	
}
