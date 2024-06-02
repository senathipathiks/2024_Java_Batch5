package com.collections;
import java.util.ArrayList;
public class Lab1 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("red");
		list.add("white");
		list.add("black");
		list.add("blue");
		list.add("pink");
		list.add("yellow");
		
		System.out.println(list);
		list.removeAll(list);
		System.out.println(list);

	}

}
