package oops.day4;

interface Engine{
	void engineCapacity(int cc);
	void topSpeed(int km);
}
interface Brand {
	void brandName(String nm);
	void model(String mdl);
}

abstract class Vehicle1 implements Engine, Brand {
	public abstract void engineCapacity(int cc);
	public abstract void topSpeed(int km);
	public abstract void brandName(String nm);
	public abstract void model(String ml);
}

class Bike2 extends Vehicle1 {
	public void engineCapacity(int cc) {
		System.out.println(cc+"cc");
	}
	public void topSpeed(int km) {
		System.out.println(km+"kmph");
	}
	public void brandName(String name) {
		System.out.println("Brand Name : "+name);
	}
	public void model(String mdl) {
		System.out.println("Model "+ mdl);
	}
}

public class MultipleInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle1 yamaha = new Bike2();
		yamaha.brandName("Yamaha");
		yamaha.model("R15 v4");
		yamaha.engineCapacity(155);
		yamaha.topSpeed(158);

	}

}
