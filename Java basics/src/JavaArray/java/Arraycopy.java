package JavaArray.java;

import java.util.Scanner;

public class Arraycopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[5];
		int [] arr1 = new int[5];
		
		for(int i=0;i<5;i++) {
			arr[i] = sc.nextInt();
		}
		
//		System.arraycopy(arr, 0, arr1, 2, 2);
		arr1 = arr;
		if(arr1==arr)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("False");
		}
		for(int i:arr1) { // for each loop
			System.out.println(i);
		}
	}

	}


