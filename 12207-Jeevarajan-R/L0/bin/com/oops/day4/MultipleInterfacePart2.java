package oops.day4;

interface one {
	int a = 10;
	int b = 20;
}

interface two {
	int a = 15;
	int c = 25;
}

interface Methods extends one, two {
	void add(int a, int b);
	void sub(int a, int b);
	void multi(int a, int b);
	void div(int a, int b);
	void mod(int a, int b);
}

abstract class Calculator implements Methods {
	public Calculator() {
		// TODO Auto-generated constructor stub
		System.out.println("Calculator is initiated...");
	}
	public abstract void add(int a, int b);
	public abstract void sub(int a, int b);
	public abstract void multi(int a, int b);
	public abstract void div(int a, int b);
	public abstract void mod(int a, int b);
}

class Calci extends Calculator {
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	public void sub(int a, int b){
		System.out.println(a-b);
	}
	public void multi(int a, int b){
		System.out.println(a*b);
	}
	public void div(int a, int b){
		System.out.println(a/b);
	}
	public void mod(int a, int b){
		System.out.println(a%b);
	}
}

public class MultipleInterfacePart2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calci ci = new Calci();
		ci.add(two.a, one.b);
		ci.div(two.a, one.b);
		ci.sub(two.a, one.b);
		ci.multi(two.a, one.b);
		ci.mod(two.a, one.b);

	}

}
