package srienath.Junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainTest6 {

	@Test
	void test() {
		assertTrue(Main.isPrime(5));
		//assertFalse(Main.isPrime(1));
	}
	
	@Test
	void test1() {
		assertTrue(Main.isPrime(8));
	}
}
