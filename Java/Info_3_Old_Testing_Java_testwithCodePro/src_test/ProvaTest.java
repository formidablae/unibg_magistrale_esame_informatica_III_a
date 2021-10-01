import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ProvaTest</code> contains tests for the class <code>{@link Prova}</code>.
 *
 * @generatedBy CodePro at 11/30/11 10:23 AM
 * @author garganti
 * @version $Revision: 1.0 $
 */
public class ProvaTest {
	/**
	 * Run the int foo(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/30/11 10:23 AM
	 */
	@Test
	public void testFoo_1()
		throws Exception {
		Prova fixture = new Prova();
		int a = 1;
		int b = 5;

		int result = fixture.foo(a, b);

		// add additional test code here
		assertEquals(7, result);
	}

	/**
	 * Run the int foo(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/30/11 10:23 AM
	 */
	@Test
	public void testFoo_2()
		throws Exception {
		Prova fixture = new Prova();
		int a = 8;
		int b = 1;

		int result = fixture.foo(a, b);

		// add additional test code here
		assertEquals(9, result);
	}

	/**
	 * Run the int foo(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/30/11 10:23 AM
	 */
	@Test
	public void testFoo_3()
		throws Exception {
		Prova fixture = new Prova();
		int a = 0;
		int b = 1;

		int result = fixture.foo(a, b);

		// add additional test code here
		assertEquals(200, result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 11/30/11 10:23 AM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 11/30/11 10:23 AM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 11/30/11 10:23 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ProvaTest.class);
	}
}