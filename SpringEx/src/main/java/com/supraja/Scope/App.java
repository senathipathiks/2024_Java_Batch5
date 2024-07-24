package com.supraja.Scope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.supraja.SpringEx.Student;

public class App 
{
	public static void main(String args[])
	{
   ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beans1.xml");
   Student st=(Student)context.getBean("stu");
   st.setName("Venkk");
   System.out.println(st);
   Student st1=(Student)context.getBean("stu");
   System.out.println(st1);
   if(st==st1)
   {
	   System.out.println("Equal");
   }
}
}
