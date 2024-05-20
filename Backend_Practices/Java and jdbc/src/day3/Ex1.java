package day3;

import java.util.Scanner;


	
	class Employee{
		private int rno;
		private String ename;
		
		public int getRollNo(){
			
			return rno;
		}
		
		public void setRollNo(int rno) {
			this.rno = rno;
		}
		
		public String getName(){
			
			return ename;
		}
		
		public void setName(String ename) {
			this.ename = ename;
		}
		
//		void getdata(int no, String name) {
//			rno = no;
//			ename = name;
//			
//		}
		
		void display() {
			System.out.println("--------------------------");
			System.out.println("Employee Roll Number: "+rno);
			System.out.println("Employee Name: "+ ename);
			System.out.println("--------------------------");

			
		}
	}
	
	

public class Ex1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter total number of employees count: ");
		
		int size = scanner.nextInt();
		
		Employee obj[] = new Employee[size];
		
		int rno;
		String ename;
		for(int i=0;i<size;i++) {
			obj[i] = new Employee();
			System.out.println("Enter Employee Roll Number: ");
			obj[i].setRollNo(scanner.nextInt());
			System.out.println("Enter Employee Name: ");
			obj[i].setName(scanner.next());
			
			}
		System.out.println("-----------Employee Details----------");
		for(Employee j:obj) {
			j.display();
		}
	}

}
