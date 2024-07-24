package com.supraja.dependency;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
  public static void main(String args[])
  {
	  ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("Beans3.xml");
	  Student stu=(Student)context.getBean("st1");
	  stu.display();
  }
}
