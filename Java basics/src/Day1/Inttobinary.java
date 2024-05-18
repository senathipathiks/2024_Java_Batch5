package Day1;

import java.util.Scanner;

public class Inttobinary {
	
	static void binary(int b) {
		int i = 0;
		int arr[] = new int[32];
		while(b!=0) {
		arr[i] = b % 2;
		b = b / 2;
		i++;
		}
	for(int j=i-1;j>=0;j--) {
		System.out.print(arr[j]);
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		binary(a);
	}

}
