import static org.junit.Assert.*;

import org.junit.Test;


public class CalcoloTestMCDC {


	@Test
	public void testM_copMCDC_ht() {
		// h > 100 T and F
		Calcolo.m(11, 11, true);
	}
	@Test
	public void testM_copMCDC_hf() {
		Calcolo.m(1, 1, true);
	}
	@Test
	public void testM_copMCDC_pf() {
		// proceed true and false (true già fatto)
		Calcolo.m(11, 11, false);
	}
	@Test
	public void testM_copMCDC_xt() {
		// x == 0 true and false (x == 0 false già fatto)
		Calcolo.m(0, 11, true);
	}

}
