package com.vidhu.task30;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	@Bean
	public Subject genSubject() {
		Subject s = new Subject();
		s.setSub1("Maths");
		s.setSub2("Physics");
		s.setSub3("Chemistry");
		s.setSub4("Biology");
		s.setSub5("Zoology");
		return s;
	}


	@Bean (name = "fac")
	public Faculty genFaculty() {
		Faculty f = new Faculty();
		f.setFacultyId(101);
		f.setFacultyName("Pradeepa");
		return f;	
		
	}
	@Bean (name = "facu")
	public Faculty genFaculty1() {
		Faculty f = new Faculty();
		f.setFacultyId(101);
		f.setFacultyName("Pradeep");
		return f;	
		
	}


}
