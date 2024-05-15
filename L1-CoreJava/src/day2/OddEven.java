package day2;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s  = new Scanner(System.in);
	    int sz =s.nextInt();
	    int arr[]= new int[sz];
	    for (int i=0;i<sz;i++) {
	    	arr[i]=s.nextInt();
	    }
	    System.out.println("Even indexeded Elemts");
	    for(int i=0;i<sz;i+=2) {
	    	System.out.println(arr[i]);
	    }
	    System.out.println("Odd indexed Elemts");
	    for(int i=1;i<sz;i+=2) {
	    	System.out.println(arr[i]);
	    }
	}

}
