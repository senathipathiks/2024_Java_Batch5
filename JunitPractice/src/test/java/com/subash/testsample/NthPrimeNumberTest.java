package com.subash.testsample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NthPrimeNumberTest {

	@Test
	void test() {
		assertEquals(5, NthPrimeNumber.nthPrimeNumber(3));
	}
	
	@Test
	void test1() {
	assertEquals(2, NthPrimeNumber.nthPrimeNumber(1));
}

}
