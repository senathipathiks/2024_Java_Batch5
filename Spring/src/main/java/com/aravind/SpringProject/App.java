package com.aravind.SpringProject;
import org.springframework.*;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class App 
{
    public static void main( String[] args )
    {
       // ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
          
//    	Employee e = (Employee)context.getBean("emp");
//        System.out.println(e); //invoke tostring method
//        
//        Employee e1 = (Employee)context.getBean("emp1");
//        System.out.println(e1);
//        
//        Student s = (Student)context.getBean("stu");
//        System.out.println(s);
        
        ClassPathResource resource = new ClassPathResource("beans.xml");
        XmlBeanFactory context = new XmlBeanFactory(resource);
        Employee e = (Employee)context.getBean("emp");
        System.out.println(e); //invoke tostring method
        
        Employee e1 = (Employee)context.getBean("emp1");
        System.out.println(e1);
        
        Student s = (Student)context.getBean("stu");
        System.out.println(s);
        
        //constructor injection
        Student s1 = (Student)context.getBean("stu1");
        System.out.println(s1);
    }
}
