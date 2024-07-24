package com.aravind.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AdditionTest {

	@Test
	void test() {
		Addition add = new Addition();
		assertEquals(8, add.sum(3, 5));
	}

}
