package com.gopi.employee;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.gopi.laptop.*;

@Configuration
//@ComponentScan(basePackages = "com.gopi.config1")
public class Config {

	
	@Bean
	public Department disSpec(){
		Department s = new Department();
		s.setDepid(1);
		s.setDepname("L & D");
		s.setDepmanager("Gopi");
		return s;
	}
	
	@Bean (name="emp")
	@Scope("singleton")
	public Employee disLop() {
		Employee emp = new Employee();
		emp.setEid(1);
		emp.setEname("Gopi");
		return emp;
	}
}
