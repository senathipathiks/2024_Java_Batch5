package Spring.eg6;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student s = (Student)context.getBean("stu");
        Student s2 = (Student)context.getBean("stu2");
        s.display();
        s2.display();
    }
}
