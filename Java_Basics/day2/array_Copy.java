package day2;

import java.util.Scanner;

public class array_Copy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int []arr=new int[5];
		int []arr1=new int[5];


		
		for(int i=0;i<5;i++) {
			arr[i]= sc.nextInt();
		}
		
//	   System.arraycopy(arr, 0, arr1, 2, 2);
		
		
		arr1=arr.clone();
		
//		----->  Enhanced for loop ------->
		for(int i : arr) {
			System.out.println(i);
			
		}
	}

}
