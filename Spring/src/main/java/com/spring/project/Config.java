package com.spring.project;


import org.springframework.beans.factory.annotation.AnnotationBeanWiringInfoResolver;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


@Configuration
@ComponentScan(basePackages = "com.spring.project")
public class Config {
//@Bean
//@Scope("singleton")
//public Address genAddress() {
//	
//	
//	Address addr = new Address();
//	addr.setNo(20);
//	addr.setCity("Madurai");
//	addr.setSt("Thendral 7th Street");
//	return addr;
//}
//
//@Bean
//public Subject genSubject() {
//	
//	Subject subj = new Subject();
//	subj.setEng("English");
//	subj.setEngmark(70);
//	subj.settam("Tamil");
//	subj.setTammark(80);
//	subj.setMat("Maths");
//	subj.setMatmark(90);
//	subj.setSci("Science");
//	subj.setScimark(95);
//	subj.setSoc("Social");
//	subj.setSocmark(99);
//	
//	return subj;
//}
//@Bean (name="std")
//public Student genStudent(){
//	Student student = new Student();
//	student.setId(1001);
//	student.setName("Vashi");
//	return student;
//}


}
