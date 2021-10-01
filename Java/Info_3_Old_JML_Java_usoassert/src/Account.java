// account con assert senza DBC
public class Account {

	public int balance;

	static final int MIN_BAL = 1000;

	public Account(int a) {
		assert a >= MIN_BAL : " non rispetta il min balance";
		balance = a;
	}

	public int deposit(int a){
		int old_balance = balance;
		assert a > 0: "a deve essere > di 0";
		// eq:
		// if (!(a>0)) throw java.lang.AssertionError();
		balance += a -1;
		assert balance == old_balance + a;
		return balance;
	}
	
	
	public static void main(String[] args) {
		Account myacc = new Account(3000);
		System.out.println(myacc.balance);
		
		myacc.deposit(10);
		
		//myacc.deposit(0);
		//myacc = new AccountTemp(30);
		//System.out.println(myacc.balance);

	}

}
