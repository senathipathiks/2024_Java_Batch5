package com.nandha.junittasks;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class AppTest {

	@Test
	void testSumOfDigits() {
		int num = 1234;
		assertEquals(10, App.sumOfDigits(num));
	}

}
