package oops.day2;


//Multilevel Inheritance

class NewClass{
	int a = 4;
	void display() {
		System.out.println("Parent Class"+a);
	}
}

class SubClass extends NewClass{
	
	int a = 10;
	void display() {
		System.out.println("SubClass");
	}
}

public class Practice1{
	public static void main(String[] arg) {
		NewClass ns = new SubClass();
		ns.a = 10;
		ns.display();
	}
	
}