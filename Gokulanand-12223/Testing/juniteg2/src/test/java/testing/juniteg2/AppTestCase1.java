package testing.juniteg2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AppTestCase1 {

	@Test
	void testSum() 
	{
		assertEquals(21, App.sum(678));
	}

}
