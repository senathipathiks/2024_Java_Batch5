package Classes;
import java.util.*;
class Static{
	static int count;
	
	Static(){
		count++;
		
	}
	void display() {
		System.out.println(count);
	}
	
}
public class StaticEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Static obj=new Static();
obj.display();

	}

}
