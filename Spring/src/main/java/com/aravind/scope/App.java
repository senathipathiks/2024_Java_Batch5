package com.aravind.scope;
import org.springframework.*;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class App 
{
    public static void main( String[] args )
    {
       

        
        ClassPathResource resource = new ClassPathResource("beans2.xml");
        XmlBeanFactory context = new XmlBeanFactory(resource);
        
        
        Student s = (Student)context.getBean("stu");
        s.setName("Vickee");
        System.out.println(s);
        
        Student s1 = (Student)context.getBean("stu");
        System.out.println(s1);
        
        if(s==s1) {
        	System.out.println("equal");
        }
        else {
        	System.out.println("References are not equal");
        }
    }
}
