package com.junit.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AgeVerifierTest {

	@Test
	void testCheckEligibility() throws InvalidAgeException {
		
		AgeVerifier obj = new AgeVerifier();
		assertEquals("Eligible", obj.checkEligibility(20));
	}
	
	
	@Test
	void testCheckEligiblity2() throws InvalidAgeException{
		
		AgeVerifier obj = new AgeVerifier();
		assertThrows(InvalidAgeException.class, () -> obj.checkEligibility(9));
	}
	
	@Test
	void testCheckEligiblity3() throws InvalidAgeException{
		
		AgeVerifier obj = new AgeVerifier();
		assertEquals("Eligible", obj.checkEligibility(18));
	}

}
