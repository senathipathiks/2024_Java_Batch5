package day3;

class Employee6{
	private int no;
	private String name;
	Employee6(int no,String name){
		this.no=no;
		this.name=name;
	}
	void display() {
		System.out.println("The name : "+ name);
		System.out.println("The no is : " + no);
		
	}
	
}


class Manager extends Employee6{
	String dept;
	Manager(int no, String name,String dept){
		super(no,name);
		this.dept=dept;
		
	}
	void display() {
		super.display();
		System.out.println("The Department is : " + dept);
		
	}
	
}
public class Single_inheritance {

	public static void main(String[] args) {
		Manager m1 = new Manager(12,"Ram","IT");
		m1.display();
		
	}

}
