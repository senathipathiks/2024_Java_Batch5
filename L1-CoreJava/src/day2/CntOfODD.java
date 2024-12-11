package day2;

import java.util.Scanner;

public class CntOfODD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s  = new Scanner(System.in);
	    int sz =s.nextInt();
	    int arr[]= new int[sz];
	    int cnt=0;
	    for (int i=0;i<sz;i++) {
	    	arr[i]=s.nextInt();
	    	if(arr[i]%2!=0) {
	    		cnt++;
	    	}
	    }
	    System.out.println(cnt);
	}

}
