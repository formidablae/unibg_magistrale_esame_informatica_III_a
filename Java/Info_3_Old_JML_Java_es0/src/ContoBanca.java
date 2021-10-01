
public class ContoBanca {

	int balance;
	 
	//@ requires amount > 0;
	public ContoBanca(int amount){
		balance = amount;
	}
	
	public static void main(String[] args) {
		ContoBanca p = new ContoBanca(0);
	}
}
