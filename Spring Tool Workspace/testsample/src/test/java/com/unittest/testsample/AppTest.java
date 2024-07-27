package com.unittest.testsample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AppTest {

	@Test
	void testCompareString() {
		assertTrue(App.CompareString("Nagarjun", "Nagarjun"));
	}
	
	@Test
	void testCompareString1() {
		assertEquals(0,App.CompareString("Nagarjun", "nagarjun"));
	}
	
}
