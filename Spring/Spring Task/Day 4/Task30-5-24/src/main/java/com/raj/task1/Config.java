package com.raj.task1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class Config {
	
	@Bean 
	public Depart generateaddress() {
		Depart dp = new Depart();
		dp.setDeptid(100);
		dp.setDeptname("Marketing");
		return dp;
	}
	
	@Bean (name="std1")
	public Employee getStudent() {
		Employee e1 = new Employee();
		e1.setEmpid(1);
		e1.setEmpname("Ponraj");
		e1.setSalary(75000);
		return e1;
	}
	
}

 

 