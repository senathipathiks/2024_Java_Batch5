package ExceptionHandling;
import java.io.FilterOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Sample2 {

	public static void main(String s[]) {
		// TODO Auto-generated method stub
try {
	Class class1=Class.forName("Sample");
}catch(ClassNotFoundException e) {
	System.out.println(e);
}
System.out.println("k");
	}

}
