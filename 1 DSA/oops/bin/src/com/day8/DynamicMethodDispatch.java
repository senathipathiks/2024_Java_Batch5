package com.day8;

 class Hello2 {
	void Hello(){
			System.out.println("poiuuy");

	 }
	void y() {
		System.out.println("y1");
		}
}

 public class DynamicMethodDispatch extends Hello2 {

	 void y() {
		 System.out.println("y2");
		}
	public static void main(String[] args) {
//		System.out.println("kytktv");
		Hello2 he = new DynamicMethodDispatch();  //Dynamic Method Dispatch
		he.Hello();
		he.y();
	}
	
	
}
