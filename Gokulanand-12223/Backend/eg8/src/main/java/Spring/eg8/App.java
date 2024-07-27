package Spring.eg8;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(config.class);
        Student s = (Student)context.getBean(Student.class);
        s.display();
    }
}
