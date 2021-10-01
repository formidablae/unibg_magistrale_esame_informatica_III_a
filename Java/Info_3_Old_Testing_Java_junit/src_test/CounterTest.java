import static org.junit.Assert.*;

import org.junit.Test;

public class CounterTest {

	@Test
	public void testInc() {

		Counter c = new Counter();

		int x = c.inc();

		// controll che x sia uguale a 1

		assertEquals(1, x);

	}

}
