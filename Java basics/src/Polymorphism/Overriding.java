package Polymorphism;

	
	 vehicle
	{
		void run()
		{
			System.out.println("Vehicle class");
		}
	}
	
	class Bike extends Vehicle
	{
		void run()
		{
			System.out.println("Bike class");
		}
	}
	class Car extends Vehicle
	{
		void run()
		{
			System.out.println("car class");
		}
	}


public class Overriding {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle obj1;
		Car obj1 = new Car();
		obj1.run();
		obj1=new Bike();
		obj1.run();
		obj1=new Vehicle();
		obj1.run();
	}

}
