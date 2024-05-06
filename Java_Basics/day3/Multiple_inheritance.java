package day3;

class A{
	A(){
		System.out.println("Class A");
		
	}
}
class B extends A{
	B(){
		System.out.println("Class B");
		
	}
}
class C extends B{
	C(){
		System.out.println("Class C");
		
	}
}



public class Multiple_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C obj1 = new C();
	}

}
