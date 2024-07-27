package com.day2;

public class Character {

	public static void main(String[] args) {
		String s1 = new String("Character,hi");
		
		System.out.println(s1);
		System.out.println(s1.charAt(1)); //Index starts with 0
		System.out.println(s1.indexOf('a'));
		System.out.println(s1.length());
		System.err.println(s1.lastIndexOf('a')); //prints repeated letter's last index
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.equals("Character"));
		System.out.println(s1.equalsIgnoreCase("charActer"));//S1 is greater than it returns positive number,if viceversa negative value will be returned
		System.out.println(s1.compareTo("Charactera"));
		System.out.println(s1.compareToIgnoreCase("Character"));
		System.out.println(s1.contains("Ch"));
		System.out.println(s1.startsWith("ch"));
		System.out.println(s1.startsWith("Ch"));
		System.out.println(s1.endsWith("rz"));
		System.out.println(s1.replace('c', 'k'));
		System.out.println(s1.repeat(5));
		System.out.println(s1.trim());
		System.out.println(s1.strip());
		System.out.println(s1.substring(4,8));
		
		//Split
		String[] s2 = s1.split(",");
		for(int i : s2) {
			System.out.println(i);
		}
	}

}
