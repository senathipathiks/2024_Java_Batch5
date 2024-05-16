package com.day1;
import java.util.*;
public class Divisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		for(int i=1;i<100;i++) {
			if(i%3==0 || i%5==0) {
				System.out.print(i+" ");
			}
		}
	}

}
