package com.vidhu.task30;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	@Value("101")
	int eid;
	
	@Value("Aravind")
	String ename;
	
	@Autowired
	Department dep;

	public void display() {
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(dep);
	}
	
	

}
