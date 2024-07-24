package com.junitex.ex1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AgeVerifierTest {

	@Test
	void testCheckEligibility() throws InvalidAgeException {
		AgeVerifier obj = new AgeVerifier();
		assertEquals("Eligible", obj.checkEligibility(20));
	}
	
	@Test
	void testCheckEligibility2() throws InvalidAgeException {
		AgeVerifier obj = new AgeVerifier();
		assertThrows(InvalidAgeException.class,()->obj.checkEligibility(10));
	}
	
	@Test
	void testCheckEligibility3() throws InvalidAgeException {
		AgeVerifier obj = new AgeVerifier();
		assertThrows(InvalidAgeException.class,()->obj.checkEligibility(17));
	}
	
	@Test
	void testCheckEligibility4() throws InvalidAgeException {
		AgeVerifier obj = new AgeVerifier();
		assertEquals("Eligible", obj.checkEligibility(18));
	}

}
