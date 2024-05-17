package day6;

import java.io.FileInputStream;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a =120 ,b =0;
      try {
////    	  int res =a/b;
//    	  int arr[]=new int[5];
//    	  arr[10]=10;
//    	 FileInputStream fin = new FileInputStream("C:\\Users\\vashanth.thoppey\\eclipse-workspace\\L1Java\\bin\\day6\\Dummy.class");
    	 Class class1 = Class.forName("Dummy");
    	 
      }
      catch(Exception e) {
		// TODO: handle exception
//    	  System.err.println(e+"Cant Divide a number less than or Equal to 0");
    	  System.err.println("Exception Occured "+e);
	}
      finally {
             System.out.println("Exception Handled... ");
	}
	}

}
