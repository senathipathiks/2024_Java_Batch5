package com.madhan.employee;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Department {
	
	
	@Value("45")
	int deptid;
	@Value("L and D")
	String deptname;
	@Value("Gowtham")
	String deptstaff;
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public String getDeptstaff() {
		return deptstaff;
	}
	public void setDeptstaff(String deptstaff) {
		this.deptstaff = deptstaff;
	}
	@Override
	public String toString() {
		return "Department [deptid=" + deptid + ", deptname=" + deptname + ", deptstaff=" + deptstaff + "]";
	}
	
	

}
