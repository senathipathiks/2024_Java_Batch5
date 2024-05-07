package com.day2;

import java.util.Scanner;

public class P12 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	     System.out.println("Enter Input String :");
	         
	     String str = sc.nextLine();
	     char ch [] = str.toCharArray();
	     
	     for(int i=0;i<ch.length;i++)
	     {
	    	 int c=1;
	    	 for(int j=i+1;j<ch.length;j++)
	    	 {
	    		 if(ch[i]==ch[j]&& ch[i]!='#')
	    		 {
	    			 ch[j]='#';
	    			 c=0;
	    			 break;
	    		 }
	    	 }
	    	 if(c==0)
	    	 {
	    		 System.out.print(ch[i]);
	    	 }
	     }

	}

}
