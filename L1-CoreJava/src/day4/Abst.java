package day4;
interface ServiceStation{
	void service();
}
class TwoWheeler implements ServiceStation{
	public void service() {
		System.out.println("Two wheeler st");
	}
}
class FourWheeler implements ServiceStation{
	public void service() {
		System.out.println("Four Wheeler st");
	}
}
public class Abst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ServiceStation objServiceStation ;
       objServiceStation= new TwoWheeler();
       objServiceStation.service();
       objServiceStation=new FourWheeler();
       objServiceStation.service();
	}

}
