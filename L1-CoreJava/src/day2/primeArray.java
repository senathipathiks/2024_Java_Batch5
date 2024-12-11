package day2;

import java.util.Scanner;

public class primeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			boolean flag = true;
			for(int j=2;j<arr[i];j++){      
			    if(arr[i]%j == 0){      
			    	flag=false;      
			    	break;      
			    }      
			}  
			if(flag)  { 
				System.out.println(arr[i]+" is prime number"); 
			} 
		}

	}

}
