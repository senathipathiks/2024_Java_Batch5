package day1;

public class ConstructorOverloading {
	
		ConstructorOverloading(int a, int b) {
			this (10.0f, 23.4f);
			System.out.println(a + b);
		}
		
		ConstructorOverloading(float a, float b) {
			System.out.println(a + b);
		}
		
		ConstructorOverloading(int a , int b, int c) {
			System.out.println(a + b + c);
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			ConstructorOverloading obj1 = new ConstructorOverloading(10,20);
			 
		}

	}


