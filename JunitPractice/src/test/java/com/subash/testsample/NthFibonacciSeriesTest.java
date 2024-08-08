package com.subash.testsample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NthFibonacciSeriesTest {

	@Test
	void test() {
		assertEquals(34, NthFibonacciSeries.nthFibonacciSeries(9));
	}

}
