package Classes;
import java.util.*;

 class Employee{
	 int eno;
	 String name;
	 Employee(int n,String nm){
		 eno=n;
		 name=nm;
	 }
 }
public class Sample {
	public static void main(String[] args) {
Employee obj1=new Employee(1,"k");
System.out.println(obj1.eno);
System.out.println(obj1.name);

	}

}
