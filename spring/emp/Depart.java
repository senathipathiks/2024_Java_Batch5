package com.ani.emp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Depart {
	@Value("Intern")
	String dep1;
	
	@Value("Trainee")
	String dep2;
	
	@Value("Developer")
	String dep3;
	
	@Value("Trainer")
	String dep4;
	
	@Value("Tester")
	String dep5;

	@Override
	public String toString() {
		return "Department [dep1=" + dep1 + ", dep2=" + dep2 + ", dep3=" + dep3 + ", dep4=" + dep4 + ", dep5=" + dep5
				+ "]";
	}
	
	
		

}