package testing.juniteg1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AppTestCase2 {

	@Test
	void testSum() 
	{
		int [] arr = {1, 2 , 3, 4};
		assertEquals(10, App.sum(arr));		
	}

}
