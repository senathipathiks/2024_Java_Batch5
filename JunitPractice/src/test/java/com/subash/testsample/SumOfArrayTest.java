package com.subash.testsample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumOfArrayTest {

	@Test
	void test() {
		int arr[] = {1,2,3,4,5};
		assertEquals(15, SumOfDigits.sumOfDigits(arr));
	}

}
