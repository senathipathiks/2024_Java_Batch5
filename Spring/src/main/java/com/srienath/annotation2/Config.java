package com.srienath.annotation2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	@Bean
	public Address generateAddress()
	{
		Address add1=new Address();
		add1.setDoorno(15);
		add1.setStrname("Vilangudi");
		add1.setCity("Madurai");
		
		return add1;
	}
	@Bean
	public Subject generateSubject()
	{
		Subject sub1=new Subject();
		sub1.setSubno(1);
		sub1.setSubname("Maths");
		sub1.setChapters(11);
		
		return sub1;
	}
	@Bean(name="stu1")	
	public Student generateStudent()
	{
		Student stu1=new Student();
		stu1.setSid(123);
		stu1.setsName("Vilangudi");
		
		return stu1;
	}
}
