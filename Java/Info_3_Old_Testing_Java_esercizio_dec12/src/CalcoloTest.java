import static org.junit.Assert.*;

import org.junit.Test;


public class CalcoloTest {

	@Test
	public void testM_copInstruzioni() {
		Calcolo.m(0, 0, false);
	}

	@Test
	public void testM_copBranch() {
		Calcolo.m(0, 0, false);
		Calcolo.m(10, 0, false);
	}
	@Test
	public void testM_copCondition() {
		Calcolo.m(0, 0, false);
		Calcolo.m(10, 12, true);
	}
	@Test
	public void testM_copCondition2() {
		Calcolo.m(10, 12, true);
		Calcolo.m(0, 0, false);
		Calcolo.m(10, 12, true);
	}

}
