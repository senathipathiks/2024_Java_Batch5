package com.nandha.Ex2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Department {
	
	@Value("123")
	int deptNo;
	@Value("Computer Science")
	String deptName;

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(int deptNo, String deptName) {
		super();
		this.deptNo = deptNo;
		this.deptName = deptName;
	}

	

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}

	public void setDept(int deptNo) {
		this.deptNo = deptNo;
	}

}
