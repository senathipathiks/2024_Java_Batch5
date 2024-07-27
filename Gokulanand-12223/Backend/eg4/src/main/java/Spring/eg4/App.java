package Spring.eg4;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Employee e = (Employee)context.getBean("emp");
        e.display();      
    }
}
