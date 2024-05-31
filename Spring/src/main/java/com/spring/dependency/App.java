package com.spring.dependency;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
 public static void main(String args[]) {
	 
	 
	 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	 Student std = (Student)context.getBean("st");
//	 Address address = (Address)context.getBean("addr");
	 std.setId(1111);
	 std.disp();	
}
}
