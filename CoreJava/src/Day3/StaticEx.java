package Day3;

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
	    
		Static s=new Static();
		Static s1=new Static();
		s.display();
		s1.display();
		
	}

}
