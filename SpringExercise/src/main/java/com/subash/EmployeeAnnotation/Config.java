package com.subash.EmployeeAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class Config {

	@Bean(name="emp1")
	public Employee generateEmployee() {
		Employee e = new Employee();
		e.setEid(1);
		e.setEname("NETAJI");
		
		return e;
	}
	
	@Bean
	public Department generateDepartment() {
		
		Department d = new Department();
	    d.setDept("MATHEMATICS");
	    return d;
		
	}
}
