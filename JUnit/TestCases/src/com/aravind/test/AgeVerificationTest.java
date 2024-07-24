package com.aravind.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AgeVerificationTest {

	@Test
	void testCheckEligibility() throws InvalidAgeException {
		AgeVerification test = new AgeVerification();
		assertEquals("Eligible",test.checkEligiblity(20));
		
	}
	
	@Test
	void testCheckEligibility1() throws InvalidAgeException {
		AgeVerification test = new AgeVerification();
		assertThrows(InvalidAgeException.class, ()->test.checkEligiblity(10));
		
	}

}
