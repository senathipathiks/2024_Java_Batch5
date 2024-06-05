package com.vidhu.annotations;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
 		 
		@Configuration
		public class Config {
			
			@Bean
			public Address genAddress() {
				Address add1 = new Address();
				add1.setDoorno(350);
				add1.setStrname("kalvi nagar");
				add1.setCity("Madurai");
				
				return add1;
			}
			
			@Bean(name="stu")
			public StudentPojo genStudentPojo() {
				StudentPojo stu = new StudentPojo();
				stu.setId(12205);
				stu.setName("Vidhusha");
				//stu.setAddress(genAddress());
				return stu;
			}
		}
	
	
 
