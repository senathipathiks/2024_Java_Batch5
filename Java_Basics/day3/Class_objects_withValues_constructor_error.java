package day3;



class Employee1 {
	int eno; // instance variable // default value for integer is 0
	String name; // instance variable // default value for string is null
	Employee1 (int eno, String name){
		eno=eno;
		name=name;
		// it gives the ambiquety error because the variable name and the arguments are same name ... 
		// to solve this use this keyword
	}
}


public class Class_objects_withValues_constructor_error {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Employee1 obj = new Employee1(121,"Prabha");
		System.out.println(obj.eno);
		System.out.println(obj.name);

	}

}
