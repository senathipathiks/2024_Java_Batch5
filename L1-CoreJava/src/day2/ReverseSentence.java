package day2;

import java.util.Scanner;

public class ReverseSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String ch[]=str.split(" ");
		for(int i=ch.length-1;i>=0;i--) {
		System.out.print(ch[i]+" ");
		}s.close();

	}

}
