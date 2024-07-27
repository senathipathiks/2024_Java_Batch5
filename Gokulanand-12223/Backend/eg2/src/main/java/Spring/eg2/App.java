package Spring.eg2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student e1 = (Student)context.getBean("stu");
        e1.setName("Arun");
 
   	
        Student e2 =(Student)context.getBean("stu");
        System.out.println(e1);
        System.out.println(e2);
        
        if(e1==e2)
        {
        	System.out.println("Equal");
        }
    }
}
