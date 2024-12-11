package day3;

import java.util.Scanner;


class Employee{
	 private int rno;
	 private String ename ;
	 
	
	public void getdata(int rno2, String ename2) {
		// TODO Auto-generated method stub
		this.rno = rno2;
		this.ename =ename2;
	}
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Employee Number is :"+rno);
		System.out.println("Employee Name is :"+ename);
	}
	
	 
}
public class Emp {
	
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
  
   int rno ;
   String ename;
   Scanner s = new Scanner(System.in);
   System.out.println("Enter NO of Employee to Add!");
   int num = s.nextInt();
   Employee obj[] = new Employee[num];
   for(int i=0;i<num;i++) {
	   obj[i]=new Employee();
	   System.out.println("Enter No :\n");
	   rno =s.nextInt();
	   System.out.println("Enter Name:\n");
	   ename=s.next();
	   obj[i].getdata(rno,ename);
	   obj[i].display();
   }
	}

}
