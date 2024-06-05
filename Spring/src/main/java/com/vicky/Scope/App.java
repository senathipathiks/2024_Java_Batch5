package com.vicky.Scope;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.vickee.SpringProject.Employee;
import com.vickee.SpringProject.Student;


public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new  ClassPathXmlApplicationContext("beans.xml");
        Employee e = (Employee)context.getBean("emp");
        System.out.println(e);
       
        
        Student e1 = (Student)context.getBean("emp1");
        System.out.println(e1);
        
        ClassPathResource res = new ClassPathResource("beans.xml");
        XmlBeanFactory factory = new XmlBeanFactory(res);
        Employee em = (Employee)factory.getBean("emp");
        System.out.println(em);
        
    }
}
