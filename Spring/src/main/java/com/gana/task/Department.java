package com.gana.task;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Department {
	
	@Value("7284")
	int deptid;
	@Value("civil")
	String deptname;
	@Value("Spec of civil engineering")
	String deptdesc;

	
	public String toString() {
		return "Spec [deptid = "+ deptid +", deptname = "+ deptname +" , deptdesc = "+ deptdesc +"]";
		
	}


	public void setDeptid(int i) {
		// TODO Auto-generated method stub
		
	}

}
