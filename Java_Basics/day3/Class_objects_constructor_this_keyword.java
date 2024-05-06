package day3;

class Employee2 {
	int eno; 
	String name;
	static int count;
	Employee2 (int eno, String name){
		this.eno=eno; 
		this.name=name;
		
	}
	
	static int increment() {
		return count++;
	}
	void display() {
		System.out.println(eno+":"+name);
	}
}
public class Class_objects_constructor_this_keyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee2 obj = new Employee2(121,"Prabha");
		System.out.println(Employee2.increment());
		obj.display();
		
		Employee2 obj1 = new Employee2(123,"Madhan");
		System.out.println(Employee2.increment());
		obj1.display();

	}

}
