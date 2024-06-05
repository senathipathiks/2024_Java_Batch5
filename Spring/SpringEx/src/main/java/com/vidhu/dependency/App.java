package com.vidhu.dependency;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
//    	ClassPathResource resource= new ClassPathResource("beans.xml");
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
       // Employee e=(Employee)context.getBean("emp");
       // e.display();
        //System.out.println(e);
        
//        XmlBeanFactory factory = new XmlBeanFactory (resource);
        StudentPojo s1 = (StudentPojo)context.getBean("stu1");  
        s1.display();
               
    }
}
