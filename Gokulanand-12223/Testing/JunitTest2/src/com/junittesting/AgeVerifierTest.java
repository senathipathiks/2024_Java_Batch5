package com.junittesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AgeVerifierTest {

	@Test
	void testCheckEligibility() throws InvalidAgeException 
	{
		AgeVerifier age = new AgeVerifier();
		assertEquals("You are Eligible", age.checkEligibility(20));
	}
}
