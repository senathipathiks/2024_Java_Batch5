package Classes;
import java.util.*;
 
class Emp{
	private int rno;
	private String name;
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
public class Simple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Emp ob=new Emp();
ob.setName("keerthy");
ob.setRno(204015);
System.out.println(ob.getName()+ob.getRno());
	}

}
