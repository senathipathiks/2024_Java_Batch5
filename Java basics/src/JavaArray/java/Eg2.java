package JavaArray.java;

import java.util.Scanner;

public class Eg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[5];
		
		for(int i=0;i<5;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i:arr) { // for each loop
			System.out.println(i);
		}
	}

}
