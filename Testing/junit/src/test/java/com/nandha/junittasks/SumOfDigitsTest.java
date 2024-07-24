package com.nandha.junittasks;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SumOfDigitsTest {

	@Test
	void testSumOfDigits() {
		assertEquals(15, SumOfDigits.sumOfDigits(12345));
	}

}
