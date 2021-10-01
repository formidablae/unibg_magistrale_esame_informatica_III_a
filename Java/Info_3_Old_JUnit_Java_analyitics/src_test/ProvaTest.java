import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ProvaTest</code> contains tests for the class <code>{@link Prova}</code>.
 *
 * @generatedBy CodePro at 07/12/10 14.29
 * @author garganti
 * @version $Revision: 1.0 $
 */
public class ProvaTest {
	/**
	 * Run the int f(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 07/12/10 14.29
	 */
	@Test
	public void testF_1()
		throws Exception {
		Prova fixture = new Prova();
		int a = 5;
		int b = 1;

		int result = fixture.f(a, b);

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int f(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 07/12/10 14.29
	 */
	@Test
	public void testF_2()
		throws Exception {
		Prova fixture = new Prova();
		int a = 1;
		int b = 0;

		int result = fixture.f(a, b);

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int f(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 07/12/10 14.29
	 */
	@Test
	public void testF_3()
		throws Exception {
		Prova fixture = new Prova();
		int a = 1;
		int b = 1;

		int result = fixture.f(a, b);

		// add additional test code here
		assertEquals(8, result);
	}

	/**
	 * Run the int f(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 07/12/10 14.29
	 */
	@Test
	public void testF_4()
		throws Exception {
		Prova fixture = new Prova();
		int a = 1;
		int b = 1;

		int result = fixture.f(a, b);

		// add additional test code here
		assertEquals(8, result);
	}

	/**
	 * Run the int f2(Prova) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 07/12/10 14.29
	 */
	@Test
	public void testF2_1()
		throws Exception {
		Prova fixture = new Prova();
		Prova p = new Prova();

		int result = fixture.f2(p);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoSuchMethodException: f2
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.findMethod(MethodInvocationExpression.java:711)
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:571)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Unknown Source)
		assertEquals(0, result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 07/12/10 14.29
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
	 * @generatedBy CodePro at 07/12/10 14.29
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
	 * @generatedBy CodePro at 07/12/10 14.29
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ProvaTest.class);
	}
}