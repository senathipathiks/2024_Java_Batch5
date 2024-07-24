package SimpleJava;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class AdditionTest {

	@Test
	void testSum() {
		Addition obj=new Addition();
		assertEquals(10,obj.sum(6, 4));
	}

}
