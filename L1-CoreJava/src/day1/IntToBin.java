package day1;
import java.util.*;
public class IntToBin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s = new Scanner(System.in);
       int num = s.nextInt();
       int n = num;
       String no ="";
       
       while(n!=0) {
    	  no +=n%2 ;
    	  n/=2;
       }
       String res="";
       for(int i= no.length()-1 ; i>=0;i--) {
    	   res +=no.charAt(i);
       }
       System.out.println(res);
	} 

}
