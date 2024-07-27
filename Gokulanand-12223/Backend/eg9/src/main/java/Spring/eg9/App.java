package Spring.eg9;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(config.class);
        Faculty f = (Faculty)context.getBean(Faculty.class);
        f.display();
    }
}
