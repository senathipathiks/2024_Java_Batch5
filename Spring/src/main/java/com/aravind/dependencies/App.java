package com.aravind.dependencies;
import org.springframework.*;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class App 
{
    public static void main( String[] args )
    {
        
        ClassPathXmlApplicationContext c = new ClassPathXmlApplicationContext("beans4.xml"); 
        Student s = (Student) c.getBean("stu");
        Student s1 = (Student) c.getBean("stu1");
        s.display();
        s1.display();
        
        
    }
}
