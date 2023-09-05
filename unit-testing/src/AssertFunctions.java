import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class AssertFunctions {

	@Test
	public void testAssert() {
		String s1 = "JUnit";
		String s2 = "JUnit";
		assertEquals(s1, s2);
		assertSame(s1, s2);
		assertNotNull(s2);
		
		s2= null;
		
		assertNull(s2);
		
		int n1 = 4;
		int n2 = 4;
		assertEquals(n1, n2);
	}

}
