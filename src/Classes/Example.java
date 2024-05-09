package Classes;
import java.util.*;

class Emp1{
	private int rollno;
	private String name;
	void getData(int r,String n) {
		rollno=r;
		name=n;
		
	}
	void display() {
		System.out.println("Rollno:"+rollno);
		System.out.println("Name:"+name);
		
	}
	
}

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Emp1 obj[]=new Emp1[5];
int rno;
String ename;
Scanner s=new Scanner(System.in);
for(int i=0;i<5;i++) {
	obj[i]=new Emp1();

System.out.println("Enter Emp ID:");
rno=s.nextInt();
System.out.println("Enter Emp name:");
ename=s.next();
obj[i].getData(rno,ename);
obj[i].display();
}
	}

}
