package oops.day3;

class Parent{
	Parent(){
		System.out.println("Parent-default");
	}
	Parent(int a){
		System.out.println("Parent-Parameterized " + a);
	}
}
class Child extends Parent{
	Child(){
		System.out.println("Child-default");
	}
	Child(int a){
		this();
//		super(); //we cannot invoke two constructor consecutively
		System.out.println("Child-Parameterized " + a);
	}
}

public class ConstructorOverLoadInvoke {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child(2);

	}

}
