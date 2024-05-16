package Day2;

import java.util.Scanner;

public class ReverseSentence {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String sen=sc.nextLine();
		String[] rev=sen.split(" ");
		for(int i=rev.length-1;i>=0;i--) {
			System.out.print(rev[i]+" ");
		}
	}

}
