
public class Account {

	private int balance;

	Account(int val){
		assert val >= 0;
		balance = val;
	}
	
	void deposit(int amount){
		balance += amount;
	}
	
	int getBalance(){
		return balance;
	}
	
	void withdraw(int amount){
		
	}
	
}
