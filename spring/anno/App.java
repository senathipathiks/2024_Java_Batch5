package com.ani.anno;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.ani.anno.Stud;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App 
{
    public static void main( String[] args ) {
   
//    ApplicationContext context=new ClassPathXmlApplicationContext("bean1.xml");
//    Stud e = (Stud)context.getBean("student");
//    e.display();
        
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
		Stud e1=(Stud)context.getBean("student");
		e1.display();
    }
}
