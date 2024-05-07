package com.day1;

import java.util.Scanner;

public class AddBin {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
	       
		   String b1 =s.next();
	       String b2 = s.next();
	       int ans1=0;
	       int ans2=0;
	       
	       for(int i=b1.length()-1,j=0;i>=0;i--) 
	       {
	    	   int val = (b1.charAt(i))-'0';
	    	   ans1+= val * Math.pow(2,j) ;
	    	   j++;
	       }
	       
	       for(int i=b2.length()-1,j=0;i>=0;i--) 
	       {
	    	   int val = (b2.charAt(i))-'0';
	    	   ans2+= val * Math.pow(2,j) ;
	    	   j++;
	       }
	       System.out.println(ans1);
	       System.out.println(ans2);
	       
	       int sum = ans1 + ans2;
	       int n = sum;
	       String no ="";
	       
	       while(n!=0) {
	    	  no +=n%2 ;
	    	  n/=2;
	       }
	       String res="";
	       for(int i=no.length()-1;i>=0;i--) {
	    	   res +=no.charAt(i);
	       }
	       System.out.println(res);
	}

}
