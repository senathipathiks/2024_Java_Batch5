package com.velan.Testsample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AppTest1 {
	
	//Sum of the Array Test
	@Test
	void testSum() {
		int arr[]={1,2,3,4};
		assertEquals(10,App.sum(arr));
	}

	//Compare String Using Boolean Function Test
	@Test
	void testCompare() {
		assertTrue(App.CompareString1("vela", "vela"));
	}
	@Test
	void testCompare1() {
		assertFalse(App.CompareString1("VELA", "vela"));
	}
	
	// Sum of the digit Test
	@Test
	void testSumOfDigit() {	
		assertEquals(6,App.sumOfDigit(123));
	}
	
	//Maximum Value of the Digits Test
	@Test
	void testMaxOfDigit() {	
		assertEquals(6,App.maxOfDigit(563));
	}
	
	//Increasing Order of Digit Test
	@Test
	void testIncOrder() {
		assertTrue(App.IncOrderOfDigit(678));
	}
	@Test
	void testIncOrder1() {
		assertFalse(App.IncOrderOfDigit(687));
	}

	//Fibonacci Series Test
	@Test
	void testfibonacci(){
		assertEquals(34,App.fibonacci(10));
	}
	
	//Prime Number Test
	@Test
	void testprime(){
		assertEquals(0,App.prime(11));
	}
	@Test
	void testprime1(){
		assertEquals(1,App.prime(10));
	}
	 
}
