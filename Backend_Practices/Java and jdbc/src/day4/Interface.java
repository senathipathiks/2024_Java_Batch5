package day4;


interface ServiceStation{
	void service();
}

class TwoWheeler implements ServiceStation{
	public void service() {
		System.out.println("Two Wheeler Station");
	}
}

class FourWheeler implements ServiceStation{
	public void service() {
		System.out.println("Four Wheeler Station");
	}
}

public class Interface {
	
	public static void main(String[] args) {
		
		ServiceStation obj1;
		obj1 = new TwoWheeler();
		obj1.service();
		obj1 = new FourWheeler();
		obj1.service();
		
	}

}
