package oops.day3;
class SuperClass{
	SuperClass(){
		System.out.println("Super");
	}
}

class SubClass extends SuperClass{
	SubClass(){
		super();  // JVM will do this step automatically
		System.out.println("Sub");
	}
}

public class ConstructorIvoke {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubClass sb = new SubClass();
		

	}

}
