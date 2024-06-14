package taskArray;
import java.util.*;

import java.util.Scanner;

public class CopyArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);		
		int[] arr=new int[4];
		int[] arr1=new int[4];
		
		for(int i=0;i<4;i++) {
			arr[i]=s.nextInt();
		}
		for(int i:arr) {
			System.out.println(i);
		}
		System.out.println("--------------------------");
		arr1=arr;
		for(int i:arr1) {
			System.out.println(i);
		}
	}

}
