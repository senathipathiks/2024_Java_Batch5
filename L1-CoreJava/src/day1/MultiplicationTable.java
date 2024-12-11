package day1;
import java.util.*;
public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s = new Scanner(System.in);
      int mul = s.nextInt();
      for (int i=1;i<11;i++) {
    	  System.out.println(i +"* "+mul+"= "+(i*mul));
      }
	}

}
