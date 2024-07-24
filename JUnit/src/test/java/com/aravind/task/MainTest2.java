package com.aravind.task;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainTest2 {

	@Test
	void test() {
		assertEquals(8, Main.maxDigit(678));
	}
	
	@Test
	void test1() {
		assertEquals(7, Main.maxDigit(678));
	}

}
