package com.supraja.junittest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	private Calculator calculator;
	
	@BeforeEach
	public void setUp()
	{
		calculator=new Calculator();
	}
	
	@AfterEach
	public void tearDown()
	{
		calculator=null;
		System.out.println("Test finished");
	}
	@Test
	void testAdd() {
		int result=calculator.add(2, 5);
		assertEquals(7,result);
	}

	@Test
	void testSubtract() {
		int result=calculator.subtract(5, 2);
		assertEquals(3,result);
	}
	
	@Disabled("Disabled until bug #123 is fixed")
	@Test
	public void testSubstractNegativeResult()
	{
		int result=calculator.subtract(6, 2);
		assertEquals(4,result);
	}

}
