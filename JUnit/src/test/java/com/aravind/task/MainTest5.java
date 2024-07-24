package com.aravind.task;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainTest5 {

	@Test
	void test() {
		int arr1[] = {1,2,3,4,5};
		int arr2[] = {1,2,3};
		assertArrayEquals(arr2, Main.subSetArray(arr1,arr2));
	}
	
	@Test
	void test1() {
		int arr1[] = {1,2,3,4,5};
		int arr2[] = {5,6};
//		int arr3[]= {0};
		assertArrayEquals(arr2, Main.subSetArray(arr1,arr2));
	}

}
