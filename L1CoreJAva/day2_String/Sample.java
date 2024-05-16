package com.day2_String;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = new String("vicky"); //new memory will be allocated 
		System.out.println(name);
		String name1 = new String("vicky");
		System.out.println(name1);
		if(name==name1) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		System.out.println(name.charAt(1));	
		System.out.println(name.indexOf('y'));
		System.out.println(name.length());
		System.out.println(name.lastIndexOf('c'));
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.equals("vicky"));
		System.out.println(name.equalsIgnoreCase("vicky"));
		System.out.println(name.compareTo("vicky"));
		System.out.println(name.compareTo("vigneswaran"));
		System.out.println(name.compareToIgnoreCase("vic"));
		System.out.println(name.contains("ky"));
		System.out.println(name.startsWith("vi"));
		System.out.println(name.endsWith("ky"));
		System.out.println(name.replace('v', 'p'));
		System.out.println(name);
		System.out.println(name.repeat(4));
		System.out.println(name.trim());
		System.out.println(name.strip());
		System.out.println(name.substring(3));
		System.out.println(name.substring(2, 5));
		System.out.println(name.concat(name1));
		
		String[] str = name.split(",");
		for(String s : str) {
			System.out.println(s);
		}
		
		
	}

}
