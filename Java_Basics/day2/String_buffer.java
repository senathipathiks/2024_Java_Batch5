package day2;

import java.util.Arrays;

public class String_buffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer str1 = new StringBuffer("Relevantz,Pune");
		System.out.println(str1);
		System.out.println(str1.append("world"));
		System.out.println(str1);
		System.out.println(str1.insert(3, "prabha"));
		System.out.println(str1.reverse());
		str1.setCharAt(0, 'w');
		System.out.println(str1);

	}

}
