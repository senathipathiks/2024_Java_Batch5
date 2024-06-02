package com.day1;
import java.util.Scanner;

public class duplicateValuesInAnArrayOfIntegerValues {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Array size:");
		int x = sc.nextInt();
		int arr[] = new int[x];
		
		for(int i = 0 ; i < x ;i++) {
			arr[i]=sc.nextInt();
		}
		
		int flag=0;
        for(int i = 0;i < x;i++){
        	for(int j = 0;j < x;j++) {
        		if(i==j) {
        			continue;
        		}
        		if(arr[i] == arr[j] && arr[j] != -1) {
        			flag=1;
        			arr[j] = -1;
        		}
        	}
        	if(flag==1) {
        		System.out.println(arr[i]);
        		flag=0;
        	}
        }
	}

}
