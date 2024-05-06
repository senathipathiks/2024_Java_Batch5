package day3;

class A1 {
	A1() {
		System.out.println("Class A");
	}

	A1(int x) {
		System.out.println("Class A-1");
	}

}

class B1 extends A1 {
	B1() {
		System.out.println("Class B");   // For B , A should be build so it goes to A
	}

	B1(int x) {
		System.out.println("Class B-1"); 

	}
}

class C1 extends B1 {
	C1() {
		System.out.println("Class C");
	}

	C1(int x) {
		System.out.println("Class C-1");  // For C , B should be build so it goes to B
	}
}

public class Multiple_inheritance_1 {

	public static void main(String[] args) {
		C1 obj2 = new C1(5);
	}

}
