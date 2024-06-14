package Polymorphism;

public class ConstrOverloading {
int rno;
String name;
ConstrOverloading (){
	rno=0;
	name=" ";
	
	
	
}

ConstrOverloading(int r){
	rno=r;
	name="lkjhg";
	
}
ConstrOverloading(int r,String s){
	rno=r;
	name=s;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstrOverloading obj1=new ConstrOverloading();
		ConstrOverloading obj2=new ConstrOverloading(12);
		ConstrOverloading obj3=new ConstrOverloading(1,"k");
		System.out.println("obj1: rno=" + obj1.rno + ", name=" + obj1.name);
		System.out.println("obj2: rno=" + obj2.rno + ", name=" + obj2.name);
		System.out.println("obj3: rno=" + obj3.rno + ", name=" + obj3.name);

		
	}

}
