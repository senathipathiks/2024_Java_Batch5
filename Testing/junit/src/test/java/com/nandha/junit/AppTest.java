package com.nandha.junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class AppTest {

	@Test
	void testCompareString() {
		assertTrue(App.CompareString("nandha", "nandha"));
	}

	@Test
	void testCompareString1() {
		assertFalse(App.CompareString("nandha", "Nandha"));
	}

	@Test
	void testSum() {
		int[] arr = { 1, 2, 3, 4 };
		assertEquals(10, App.Sum(arr));
	}

}
