package day4;

public class constructor_overloading {
	int no;
	String name;
	constructor_overloading(){
		no=0;
		name=" ";
		System.out.println(no);
		System.out.println(name);
		
	}
	constructor_overloading(int r){
		no = r;
		name = "relevantz";
		System.out.println(no);
		System.out.println(name);
		
	}	
	constructor_overloading(int l , String a){
		no=l;
		name =a;
		System.out.println(no);
		System.out.println(name);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constructor_overloading co1 = new constructor_overloading();
		constructor_overloading co2 = new constructor_overloading(12);
		constructor_overloading co3 = new constructor_overloading(13,"arun");
		

	}

}
