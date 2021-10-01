public class Account {

	//@ invariant balance >= minBal;
	public int balance;

	public static int minBal = 1000;

	//@ requires amount >= minBal;
	//@ ensures balance == amount;
	public Account(int amount) {
		balance = amount;
	}
	
	//@ requires ok(somma);
	//@ ensures \old(balance) - somma == balance;
	//@ ensures \result == balance; 
	public int withdraw(int somma){
		balance -= somma;
		return balance;
	}
	private boolean ok(int somma){
		return  somma >= (balance - minBal);
	}
	
	
	//@ requires amount >0;
	//@ ensures balance ==\old(balance) + amount;
	public int deposit(int amount) {
		balance += amount;
		return 0;
	}
	
	public static void main(String[] args) {
		Account a = new Account(5000);
		System.out.println(a.balance);
		a.deposit(100);
		a.withdraw(4100);
	}
}
