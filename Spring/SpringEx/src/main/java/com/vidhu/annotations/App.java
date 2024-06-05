package com.vidhu.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.vidhu.annotations.StudentPojo;
import com.vidhu.annotations.StudentPojo1; 

public class App 
{
    public static void main( String[] args )
    {
//    	ClassPathResource resource= new ClassPathResource("beans.xml");
    	
    // below line is used when u use @autowired in pojo file	
    //   ApplicationContext context=new ClassPathXmlApplicationContext("beans2.xml");
    	
    	// below line is used when u use @configuration to avoid xml file 
    	//AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
        //StudentPojo s1 = (StudentPojo)context.getBean("stu");  
        //s1.display();
         
        /////////////////////////////////////////////////////////
    	
    	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Component.class);
        StudentPojo1 s1 = (StudentPojo1)context.getBean(StudentPojo1.class);  
        s1.display();
               
    }
}
