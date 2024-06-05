package ArraysAndString;

import java.util.Scanner;

public class LongestSubsequent {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements to be inserted in array");
		int n = sc.nextInt();
		int a[] = new int[n];
		
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter the element: ");
			a[i] = sc.nextInt();
		}
		
		String find = "";
		int check = 0;
		int flag = 0;
		
		for(int i=0;i<n;i++) {
			if(flag == 1) {
				break;
			}
			find =find+a[i];
			check = a[i];
			for(int j=i+1;j<n;j++) {
				if(j == n-1) {
					flag = 1;
				}
				if(a[j]==check+1) {
					find = find + a[j];
				}
				else {
					find = find + " ";
					i = j-1;
					break;
				}
				check = a[j];
			}
			
		}
		
		String s[] = find.split(" ");
		int max = 0;
		int index = 0;
		
		for(int i=0;i<s.length;i++) {
			String eachindex = s[i];
			if(eachindex.length()>max) {
				max =  eachindex.length();
				index = i;
			}
		}
		
		System.out.println("Longest subsequent in an array : "+s[index]);
	}

}
