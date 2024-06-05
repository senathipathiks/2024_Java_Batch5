package com.subash.atComponentSimple;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages ="com.subash.atComponent")
public class Config {

//	@Bean
//	@Scope("singleton")
//	public Address generateaddress() {
//		Address ad1 = new Address();
//		ad1.setDoorno("20/15");
//		ad1.setStreetname("Periyasamy nagar 13th street avaniyapuram");
//		ad1.setCity("Madurai");
//		
//		return ad1;
//	}
//	@Bean
//	public Email generateEmail() {
//		Email e = new Email();
//		e.setEmail("ssubashNetaji@56781@gmail.com");
//		
//		return e;
//	}
////	@Bean(name="stu1")
////	public Student generatestudent() {
////		
////		Student stu1 = new Student();
////		stu1.setId(123);
////		stu1.setName("NETAJI");
////		
////		return stu1;
////	}
}
