//
//     Array Sort
//     
//package com.day1;
//
//import java.util.Arrays;
//
//public class New {
//
//	public static void main(String[] args) {
//		int arr[] = {5, 6, 3, 9, 4, 8, 2, 7};
//		
//		Arrays.sort(arr);
//		for(int i : arr) {
//			System.out.println(i);
//		}
//
//	}
//
//}


//ArrayList

//package com.day1;
//
//import java.util.ArrayList;
//
//public class New{
//	public static void main(String[] args) {
//		ArrayList<Integer>list = new ArrayList<>();
//		list.add(10);
//		list.add(20);
//		list.add(30);
//		list.add(40);
//		list.add(50);
//		
//		System.out.println(list);
//		
//		list.add(2,60);
//		System.out.println(list);
//		
//		Integer obj = list.get(1);
//		System.out.println(obj);
//		
//		list.remove(1);
//		System.out.println(list);
//		
//		list.set(1,90);
//		System.out.println(list);
//		
//		System.out.println(list.size());
//		System.out.println(list.contains(10));
//		System.out.println(list.isEmpty());
//		
//		for(int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
//		for(Integer ram : list) {
//			System.out.println(ram);
//		}
//	}
//}

package com.day1;

import java.util.ArrayList;

public class New{
	public static void main(String[] args) {
		ArrayList<Integer>list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		System.out.println(list);
		
		if(list.contains(10)) {
		System.out.println("Element found");
		}
		else {
			System.out.println("Element not found");
		}

	}
}