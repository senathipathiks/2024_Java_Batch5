package com.subash.testsample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArraySubsetTest {

	@Test
	void test() {
		int arr[] = {1,2,3,4,5};
		int check[] = {1,4,5};
		assertArrayEquals(check, ArraySubset.arraySubset(arr, check));
	}

}
