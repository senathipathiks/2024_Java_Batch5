package Inheritance;

class A{
	A(){
		System.out.println("A");}
		A(int x){
			System.out.println("aa");
		}
	}
	class B extends A{
		B(){
			System.out.println("B");}
			B(int x){
				System.out.println("BB");
			}
		
	}
		class C extends B{
			C(){
				System.out.println("C");}
				C(int x){
					super(7);
					System.out.println("cc");
				}
			
	}

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
C ob=new C(5);

	}

}
