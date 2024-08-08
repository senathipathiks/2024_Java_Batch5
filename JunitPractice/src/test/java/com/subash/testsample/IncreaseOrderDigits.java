package com.subash.testsample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IncreaseOrderDigits {

	@Test
	void test() {
		assertTrue(IncreasingOrderDigits.increaseOrderCheck(789));
	}
	@Test
	void test1() {
		assertTrue(IncreasingOrderDigits.increaseOrderCheck(788));
	}

}
