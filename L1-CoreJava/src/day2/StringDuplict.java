package day2;

import java.util.Scanner;

public class StringDuplict {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.next();
		char[] ch = str.toCharArray();
		char str1[] = new char[str.length()];
		boolean flag = false;
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					str1[i]=ch[i];
					System.out.print(str1[i]+" ");
					flag=true;
				}
			}
		}
		if(flag==false) {
			System.out.println("No Duplicates");
		}

	}

}
