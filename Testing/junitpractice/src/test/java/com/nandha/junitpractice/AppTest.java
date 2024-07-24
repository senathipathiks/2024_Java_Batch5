package com.nandha.junitpractice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AppTest {

	@Test
	void testSumOfDigits() {
		assertEquals(10, App.sumOfDigits(1234));
	}
	
	@Test
	void testMaxOfDigits() {
		assertEquals(8, App.maxOfDigits(768));
	}
	
	@Test
	void testIncreasingOrderTrue() {
		assertEquals(true, App.increasingOrder(1234));
	}
	
//	@Test
//	void testIncreasingOrderFalse() {
//		assertEquals(false, App.increasingOrder(1235));
//	}

	@Test
	void testFindNthFibonacci() {
		assertEquals(55, App.findNthFibonacci(10));
	}
}
