package com.unittest.testsample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AppTest2 {

	@Test
	void testSum() {
		int[] arr = {1,2,3,4};
		assertEquals(10, App.sum(arr));
	}

}
