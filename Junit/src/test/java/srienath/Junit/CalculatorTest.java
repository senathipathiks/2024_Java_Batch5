package srienath.Junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;

class CalculatorTest {
	
	private Calculator calculator;
	
	@BeforeEach
	public void setUp(){
		calculator = new Calculator();
	}
	
	@AfterEach
	public void tearDown() {
		calculator = null;
		System.out.println("Test finished");
	}

	@Test
	void testAdd() {
		assertEquals(12,calculator.add(5,7));
	}
	
	@Test
	void testSub() {
		assertEquals(2,calculator.sub(5, 3));
	}
	
	@Disabled("disabled until bug#1 is fixed")
	@Test
	public void testSubNegativeResult() {
		assertEquals(-2,calculator.sub(3, 5));
	}

}
