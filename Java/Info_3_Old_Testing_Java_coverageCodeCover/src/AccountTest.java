import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;


public class AccountTest {

	@BeforeClass
	public static void setUp(){
		System.out.println("apri db");
	}
	
	@Test
	public void testAccount() {
		Account a = new Account(1000);
		assertEquals(1000, a.getBalance());
		assertTrue(a.getBalance() > 0 );
	}

	@Test
	public void testAccountNeg() {
		Account a = new Account(-1000);
	}

	@Test
	public void testDeposit() {
		Account a = new Account(0);
		a.deposit(1000);
		assertEquals(1000, a.getBalance());
	}

	@Test
	public void testGetBalance() {
	}

	@Test
	public void testWithdraw() {
		Account g = new Account(0);
		g.withdraw(0);
	}

}
