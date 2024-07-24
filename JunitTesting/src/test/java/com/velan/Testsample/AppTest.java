package com.velan.Testsample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AppTest {

	@Test
	void testCompareString() {
		assertEquals(1, App.CompareString("vela", "vela"));
	}
	@Test
	void testCompareString1() {
		assertEquals(0, App.CompareString("VELA", "vela"));
	}

}
