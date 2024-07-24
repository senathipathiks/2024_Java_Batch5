package com.nandha.junittesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	private Calculator calc;
	
	@BeforeEach
	public void setUp() {
		calc = new Calculator();
	}
	
	@AfterEach
	public void tearDown() {
		calc = null;
		System.out.println("Test finished");
	}

	@Test
	void testAdd() {
		assertEquals(5, Calculator.add(2,3));
	}

	@Test
	void testSub() {
		assertEquals(1, Calculator.sub(3,2));
		}
	
//	@Disabled("Disabled until bug #123 is fixed")
	@Test
	void testSubNegative() {
		assertEquals(-1, Calculator.sub(2,3));
		}
}
