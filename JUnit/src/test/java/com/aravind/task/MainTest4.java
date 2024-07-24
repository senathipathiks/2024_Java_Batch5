package com.aravind.task;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainTest4 {

	@Test
	void test() {
		assertEquals(55,Main.fibonacci(10));
	}
	
	@Test
	void test1() {
		assertEquals(5,Main.fibonacci(5));
	}

}
