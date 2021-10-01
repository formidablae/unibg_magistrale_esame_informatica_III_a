import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class AccountTestPar {

	int initiValue;
	
	public AccountTestPar(int x){
		initiValue = x;
	}
	@Parameters
	public static List<Object[]> getParms(){
		return Arrays.asList(new Object[][]{{1000},{2000},{3000}});
	}
	
	@Test
	public void testAccount() {
		Account a = new Account(initiValue);
		assertEquals(initiValue, a.getBalance());
	}
}
