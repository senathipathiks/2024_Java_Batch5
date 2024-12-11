package com.junit.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AdditionTest {

	@Test
	void testSum() {
		Addition add = new Addition();
		assertEquals(15, add.sum(10, 5));
	}

}
