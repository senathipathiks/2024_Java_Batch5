package day2;

import java.util.Arrays;
import java.util.Scanner;

public class DescArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner s  = new Scanner(System.in);
    int sz =s.nextInt();
    int arr[]= new int[sz];
    for (int i=0;i<sz;i++) {
    	arr[i]=s.nextInt();
    }
    
   
    int temp =0;
 
    for(int i=0;i<sz;i++) {
    	
    	for( int j=i+1;j<sz;j++) {
    		
    		if( arr[j]>arr[i])
    		{	 temp =arr[i];
            	arr[i]=arr[j];
            	arr[j] = temp;
    	}
    	
    	}
    	
    	
    }
    System.out.println(Arrays.toString(arr));
	}

}
