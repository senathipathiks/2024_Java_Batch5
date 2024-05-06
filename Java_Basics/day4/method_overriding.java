package day4;

public class method_overriding {
	class Vehicle {
		// defining a method
		void run() {
			System.out.println("Vehicle is running");
		}
	}

	// Creating a child class
	class Bike2 extends Vehicle{  
		  //defining the same method as in the parent class  
		  void run(){
			  System.out.println("Bike is running safely");}  
		  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Bike2 obj = new Bike2();//creating object  
		  obj.run();//calling method  


	}

}
